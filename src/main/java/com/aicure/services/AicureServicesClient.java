/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.aicure.services;

import java.util.*;

import com.aicure.services.model.EndOfTreatmentBusinessLayerResponse;
import com.aicure.services.model.CustomizedError;
import com.aicure.services.model.EndOfTreatmentBusinessLayerParams;
import com.aicure.services.model.Alarm;
import com.aicure.services.model.CompletedActionSchedule;
import com.aicure.services.model.ActionSchedule;
import com.aicure.services.model.ArrayOfStrings;
import com.aicure.services.model.ArrayOfActionSchedules;
import com.aicure.services.model.ScaleAnswer;
import com.aicure.services.model.QuestionnaireEvent;
import com.aicure.services.model.ArrayOfQuestionnaireEvent;
import com.aicure.services.model.TakeMedicationEvent;
import com.aicure.services.model.ArrayOfKitNum;
import com.aicure.services.model.ArrayOfKitNumKey;
import com.aicure.services.model.ArrayOfMedications;
import com.aicure.services.model.Medication;
import com.aicure.services.model.CheckNotificationMessageResult;
import com.aicure.services.model.NotificationMessage;
import com.aicure.services.model.NotificationSNSObject;
import com.aicure.services.model.ArrayOfNotificationMessages;
import com.aicure.services.model.ScheduleEventStatus;
import com.aicure.services.model.EventBackfillKeys;
import com.aicure.services.model.UserLevelParamStatus;
import com.aicure.services.model.ProtocolParams;
import com.aicure.services.model.ArrayOfProtocolParams;
import com.aicure.services.model.Questionnaire;
import com.aicure.services.model.ArrayOfQuestionnaireInfo;
import com.aicure.services.model.ArrayOfUnansweredQuestionnaires;
import com.aicure.services.model.TranslationDetails;
import com.aicure.services.model.ArrayOfTranslationDetails;
import com.aicure.services.model.VideoConference;
import com.aicure.services.model.Empty;
import com.aicure.services.model.ConferenceCompleteResult;
import com.aicure.services.model.ConferenceComplete;
import com.aicure.services.model.HostAccessRequest;
import com.aicure.services.model.VideoRoomAccess;
import com.aicure.services.model.ParticipantAccessRequest;


@com.amazonaws.mobileconnectors.apigateway.annotation.Service(endpoint = "https://dev-api-internal.aicure.com")
public interface AicureServicesClient {


    /**
     * A generic invoker to invoke any API Gateway endpoint.
     * @param request
     * @return ApiResponse
     */
    com.amazonaws.mobileconnectors.apigateway.ApiResponse execute(com.amazonaws.mobileconnectors.apigateway.ApiRequest request);
    
    /**
     * 
     * 
     * @param authorization 
     * @param auditTrailId 
     * @param body 
     * @param msgId 
     * @param activeStatus 
     * @return EndOfTreatmentBusinessLayerResponse
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/action_schedule_updates/questionnaire/end_of_treatment", method = "PUT")
    EndOfTreatmentBusinessLayerResponse actionScheduleUpdatesQuestionnaireEndOfTreatmentPut(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "Authorization", location = "header")
            String authorization,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "audit_trail_id", location = "query")
            String auditTrailId,
            EndOfTreatmentBusinessLayerParams body,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "msg_id", location = "query")
            String msgId,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "active_status", location = "query")
            String activeStatus);
    
    /**
     * 
     * 
     * @return void
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/action_schedule_updates/questionnaire/end_of_treatment", method = "OPTIONS")
    void actionScheduleUpdatesQuestionnaireEndOfTreatmentOptions();
    
    /**
     * 
     * 
     * @param msgId 
     * @param actionScheduleId 
     * @param authorization 
     * @return Alarm
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/action_schedules/alarms/{action_schedule_id}", method = "GET")
    Alarm actionSchedulesAlarmsActionScheduleIdGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "msg_id", location = "query")
            String msgId,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "action_schedule_id", location = "path")
            String actionScheduleId,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "Authorization", location = "header")
            String authorization);
    
    /**
     * 
     * 
     * @param msgId 
     * @param actionScheduleId 
     * @param authorization 
     * @param auditTrailId 
     * @param body 
     * @return Alarm
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/action_schedules/alarms/{action_schedule_id}", method = "PUT")
    Alarm actionSchedulesAlarmsActionScheduleIdPut(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "msg_id", location = "query")
            String msgId,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "action_schedule_id", location = "path")
            String actionScheduleId,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "Authorization", location = "header")
            String authorization,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "audit_trail_id", location = "query")
            String auditTrailId,
            Alarm body);
    
    /**
     * 
     * 
     * @param date 
     * @param scheduleId 
     * @param trialId 
     * @param patientId 
     * @return CompletedActionSchedule
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/action_schedules/completed", method = "GET")
    CompletedActionSchedule actionSchedulesCompletedGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "date", location = "query")
            String date,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "schedule_id", location = "query")
            String scheduleId,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "trial_id", location = "query")
            String trialId,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "patient_id", location = "query")
            String patientId);
    
    /**
     * 
     * 
     * @param msgId 
     * @param authorization 
     * @param auditTrailId 
     * @param body 
     * @return ActionSchedule
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/action_schedules/create", method = "POST")
    ActionSchedule actionSchedulesCreatePost(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "msg_id", location = "query")
            String msgId,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "Authorization", location = "header")
            String authorization,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "audit_trail_id", location = "query")
            String auditTrailId,
            ActionSchedule body);
    
    /**
     * 
     * 
     * @param trial 
     * @param msgId 
     * @param authorization 
     * @return ArrayOfStrings
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/action_schedules/ids/{trial}", method = "GET")
    ArrayOfStrings actionSchedulesIdsTrialGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "trial", location = "path")
            String trial,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "msg_id", location = "query")
            String msgId,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "Authorization", location = "header")
            String authorization);
    
    /**
     * 
     * 
     * @param trial 
     * @param msgId 
     * @param authorization 
     * @param user 
     * @param group 
     * @param actionType 
     * @return ArrayOfActionSchedules
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/action_schedules/trial/{trial}/user/{user}", method = "GET")
    ArrayOfActionSchedules actionSchedulesTrialTrialUserUserGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "trial", location = "path")
            String trial,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "msg_id", location = "query")
            String msgId,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "Authorization", location = "header")
            String authorization,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "user", location = "path")
            String user,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "group", location = "query")
            String group,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "action_type", location = "query")
            String actionType);
    
    /**
     * 
     * 
     * @param msgId 
     * @param authorization 
     * @param user 
     * @param group 
     * @param actionType 
     * @return ArrayOfActionSchedules
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/action_schedules/user/{user}", method = "GET")
    ArrayOfActionSchedules actionSchedulesUserUserGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "msg_id", location = "query")
            String msgId,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "Authorization", location = "header")
            String authorization,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "user", location = "path")
            String user,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "group", location = "query")
            String group,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "action_type", location = "query")
            String actionType);
    
    /**
     * 
     * 
     * @param msgId 
     * @param actionScheduleId 
     * @param authorization 
     * @return ActionSchedule
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/action_schedules/{action_schedule_id}", method = "GET")
    ActionSchedule actionSchedulesActionScheduleIdGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "msg_id", location = "query")
            String msgId,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "action_schedule_id", location = "path")
            String actionScheduleId,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "Authorization", location = "header")
            String authorization);
    
    /**
     * 
     * 
     * @param msgId 
     * @param actionScheduleId 
     * @param authorization 
     * @param auditTrailId 
     * @param body 
     * @return ActionSchedule
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/action_schedules/{action_schedule_id}", method = "PUT")
    ActionSchedule actionSchedulesActionScheduleIdPut(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "msg_id", location = "query")
            String msgId,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "action_schedule_id", location = "path")
            String actionScheduleId,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "Authorization", location = "header")
            String authorization,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "audit_trail_id", location = "query")
            String auditTrailId,
            ActionSchedule body);
    
    /**
     * 
     * 
     * @param msgId 
     * @param actionScheduleId 
     * @param authorization 
     * @param auditTrailId 
     * @return void
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/action_schedules/{action_schedule_id}", method = "DELETE")
    void actionSchedulesActionScheduleIdDelete(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "msg_id", location = "query")
            String msgId,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "action_schedule_id", location = "path")
            String actionScheduleId,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "Authorization", location = "header")
            String authorization,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "audit_trail_id", location = "query")
            String auditTrailId);
    
    /**
     * 
     * 
     * @param authorization 
     * @param body 
     * @return QuestionnaireEvent
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/events/action-types/questionnaire", method = "POST")
    QuestionnaireEvent eventsActionTypesQuestionnairePost(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "Authorization", location = "header")
            String authorization,
            QuestionnaireEvent body);
    
    /**
     * 
     * 
     * @param trialId 
     * @param authorization 
     * @return ArrayOfQuestionnaireEvent
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/events/action-types/questionnaire/trials/{trial_id}", method = "GET")
    ArrayOfQuestionnaireEvent eventsActionTypesQuestionnaireTrialsTrialIdGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "trial_id", location = "path")
            String trialId,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "Authorization", location = "header")
            String authorization);
    
    /**
     * 
     * 
     * @return void
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/events/action-types/questionnaire/trials/{trial_id}", method = "OPTIONS")
    void eventsActionTypesQuestionnaireTrialsTrialIdOptions();
    
    /**
     * 
     * 
     * @param trialId 
     * @param patientId 
     * @param authorization 
     * @return ArrayOfQuestionnaireEvent
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/events/action-types/questionnaire/trials/{trial_id}/patients/{patient_id}", method = "GET")
    ArrayOfQuestionnaireEvent eventsActionTypesQuestionnaireTrialsTrialIdPatientsPatientIdGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "trial_id", location = "path")
            String trialId,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "patient_id", location = "path")
            String patientId,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "Authorization", location = "header")
            String authorization);
    
    /**
     * 
     * 
     * @param patientId 
     * @param targetDates 
     * @param trialId 
     * @param authorization 
     * @return ArrayOfQuestionnaireEvent
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/events/action-types/questionnaire/trials/{trial_id}/patients/{patient_id}/target-dates/{target_dates}", method = "GET")
    ArrayOfQuestionnaireEvent eventsActionTypesQuestionnaireTrialsTrialIdPatientsPatientIdTargetDatesTargetDatesGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "patient_id", location = "path")
            String patientId,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "target_dates", location = "path")
            String targetDates,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "trial_id", location = "path")
            String trialId,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "Authorization", location = "header")
            String authorization);
    
    /**
     * 
     * 
     * @param patientId 
     * @param scheduleId 
     * @param targetDates 
     * @param trialId 
     * @param authorization 
     * @return void
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/events/action-types/questionnaire/trials/{trial_id}/patients/{patient_id}/target-dates/{target_dates}/schedules/{schedule_id}", method = "DELETE")
    void eventsActionTypesQuestionnaireTrialsTrialIdPatientsPatientIdTargetDatesTargetDatesSchedulesScheduleIdDelete(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "patient_id", location = "path")
            String patientId,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "schedule_id", location = "path")
            String scheduleId,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "target_dates", location = "path")
            String targetDates,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "trial_id", location = "path")
            String trialId,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "Authorization", location = "header")
            String authorization);
    
    /**
     * 
     * 
     * @param authorization 
     * @param body 
     * @param fromBackfill 
     * @return TakeMedicationEvent
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/events/action-types/take-medication", method = "POST")
    TakeMedicationEvent eventsActionTypesTakeMedicationPost(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "Authorization", location = "header")
            String authorization,
            TakeMedicationEvent body,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "fromBackfill", location = "query")
            String fromBackfill);
    
    /**
     * 
     * 
     * @param trialId 
     * @param authorization 
     * @return TakeMedicationEvent
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/events/action-types/take-medication/trials/{trial_id}", method = "GET")
    TakeMedicationEvent eventsActionTypesTakeMedicationTrialsTrialIdGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "trial_id", location = "path")
            String trialId,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "Authorization", location = "header")
            String authorization);
    
    /**
     * 
     * 
     * @param trialId 
     * @param patientId 
     * @param authorization 
     * @return TakeMedicationEvent
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/events/action-types/take-medication/trials/{trial_id}/patients/{patient_id}", method = "GET")
    TakeMedicationEvent eventsActionTypesTakeMedicationTrialsTrialIdPatientsPatientIdGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "trial_id", location = "path")
            String trialId,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "patient_id", location = "path")
            String patientId,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "Authorization", location = "header")
            String authorization);
    
    /**
     * 
     * 
     * @param patientId 
     * @param targetDates 
     * @param trialId 
     * @param authorization 
     * @return TakeMedicationEvent
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/events/action-types/take-medication/trials/{trial_id}/patients/{patient_id}/target-dates/{target_dates}", method = "GET")
    TakeMedicationEvent eventsActionTypesTakeMedicationTrialsTrialIdPatientsPatientIdTargetDatesTargetDatesGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "patient_id", location = "path")
            String patientId,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "target_dates", location = "path")
            String targetDates,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "trial_id", location = "path")
            String trialId,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "Authorization", location = "header")
            String authorization);
    
    /**
     * 
     * 
     * @param patientId 
     * @param scheduleId 
     * @param targetDates 
     * @param trialId 
     * @param authorization 
     * @return void
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/events/action-types/take-medication/trials/{trial_id}/patients/{patient_id}/target-dates/{target_dates}/schedules/{schedule_id}", method = "DELETE")
    void eventsActionTypesTakeMedicationTrialsTrialIdPatientsPatientIdTargetDatesTargetDatesSchedulesScheduleIdDelete(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "patient_id", location = "path")
            String patientId,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "schedule_id", location = "path")
            String scheduleId,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "target_dates", location = "path")
            String targetDates,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "trial_id", location = "path")
            String trialId,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "Authorization", location = "header")
            String authorization);
    
    /**
     * 
     * 
     * @return void
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/events/hello", method = "GET")
    void eventsHelloGet();
    
    /**
     * 
     * 
     * @return void
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/events/json-schema", method = "GET")
    void eventsJsonSchemaGet();
    
    /**
     * 
     * 
     * @return void
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/events/status/profile", method = "GET")
    void eventsStatusProfileGet();
    
    /**
     * 
     * 
     * @param trial 
     * @param authorization 
     * @param user 
     * @param msgId 
     * @param onlyActive 
     * @return ArrayOfKitNum
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/kit_num_data/trial/{trial}/user/{user}", method = "GET")
    ArrayOfKitNum kitNumDataTrialTrialUserUserGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "trial", location = "path")
            String trial,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "Authorization", location = "header")
            String authorization,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "user", location = "path")
            String user,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "msg_id", location = "query")
            String msgId,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "only_active", location = "query")
            String onlyActive);
    
    /**
     * 
     * 
     * @param trial 
     * @param user 
     * @return ArrayOfKitNum
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/kit_num_data/trial/{trial}/user/{user}", method = "OPTIONS")
    ArrayOfKitNum kitNumDataTrialTrialUserUserOptions(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "trial", location = "path")
            String trial,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "user", location = "path")
            String user);
    
    /**
     * 
     * 
     * @param authorization 
     * @param mobileSyncStatus 
     * @param body 
     * @param msgId 
     * @return ArrayOfKitNumKey
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/kit_num_data/update_sync_status", method = "PUT")
    ArrayOfKitNumKey kitNumDataUpdateSyncStatusPut(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "Authorization", location = "header")
            String authorization,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "mobile_sync_status", location = "query")
            String mobileSyncStatus,
            ArrayOfKitNumKey body,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "msg_id", location = "query")
            String msgId);
    
    /**
     * 
     * 
     * @param commonName 
     * @param msgId 
     * @param authorization 
     * @return ArrayOfMedications
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/medications/common_names/{common_name}", method = "GET")
    ArrayOfMedications medicationsCommonNamesCommonNameGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "common_name", location = "path")
            String commonName,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "msg_id", location = "query")
            String msgId,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "Authorization", location = "header")
            String authorization);
    
    /**
     * 
     * 
     * @return void
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/medications/common_names/{common_name}", method = "OPTIONS")
    void medicationsCommonNamesCommonNameOptions();
    
    /**
     * 
     * 
     * @param msgId 
     * @param auditTrailId 
     * @param body 
     * @param authorization 
     * @return Medication
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/medications/create", method = "POST")
    Medication medicationsCreatePost(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "msg_id", location = "query")
            String msgId,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "audit_trail_id", location = "query")
            String auditTrailId,
            Medication body,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "Authorization", location = "header")
            String authorization);
    
    /**
     * 
     * 
     * @return void
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/medications/create", method = "OPTIONS")
    void medicationsCreateOptions();
    
    /**
     * 
     * 
     * @param trial 
     * @param msgId 
     * @param authorization 
     * @return ArrayOfMedications
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/medications/trials/{trial}", method = "GET")
    ArrayOfMedications medicationsTrialsTrialGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "trial", location = "path")
            String trial,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "msg_id", location = "query")
            String msgId,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "Authorization", location = "header")
            String authorization);
    
    /**
     * 
     * 
     * @param trial 
     * @return void
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/medications/trials/{trial}", method = "OPTIONS")
    void medicationsTrialsTrialOptions(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "trial", location = "path")
            String trial);
    
    /**
     * 
     * 
     * @param commonName 
     * @param trial 
     * @param msgId 
     * @param authorization 
     * @return ArrayOfMedications
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/medications/trials/{trial}/common_names/{common_name}", method = "GET")
    ArrayOfMedications medicationsTrialsTrialCommonNamesCommonNameGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "common_name", location = "path")
            String commonName,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "trial", location = "path")
            String trial,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "msg_id", location = "query")
            String msgId,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "Authorization", location = "header")
            String authorization);
    
    /**
     * 
     * 
     * @return void
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/medications/trials/{trial}/common_names/{common_name}", method = "OPTIONS")
    void medicationsTrialsTrialCommonNamesCommonNameOptions();
    
    /**
     * 
     * 
     * @param msgId 
     * @param medicationId 
     * @param authorization 
     * @return Medication
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/medications/{medication_id}", method = "GET")
    Medication medicationsMedicationIdGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "msg_id", location = "query")
            String msgId,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "medication_id", location = "path")
            String medicationId,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "Authorization", location = "header")
            String authorization);
    
    /**
     * 
     * 
     * @param msgId 
     * @param medicationId 
     * @param auditTrailId 
     * @param body 
     * @param authorization 
     * @return Medication
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/medications/{medication_id}", method = "PUT")
    Medication medicationsMedicationIdPut(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "msg_id", location = "query")
            String msgId,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "medication_id", location = "path")
            String medicationId,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "audit_trail_id", location = "query")
            String auditTrailId,
            Medication body,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "Authorization", location = "header")
            String authorization);
    
    /**
     * 
     * 
     * @param msgId 
     * @param medicationId 
     * @param auditTrailId 
     * @param authorization 
     * @return void
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/medications/{medication_id}", method = "DELETE")
    void medicationsMedicationIdDelete(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "msg_id", location = "query")
            String msgId,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "medication_id", location = "path")
            String medicationId,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "audit_trail_id", location = "query")
            String auditTrailId,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "Authorization", location = "header")
            String authorization);
    
    /**
     * 
     * 
     * @param medicationId 
     * @return void
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/medications/{medication_id}", method = "OPTIONS")
    void medicationsMedicationIdOptions(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "medication_id", location = "path")
            String medicationId);
    
    /**
     * 
     * 
     * @param trial 
     * @param notificationType 
     * @param authorization 
     * @param user 
     * @param msgId 
     * @return CheckNotificationMessageResult
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/notification_message/check-status/trial/{trial}/user/{user}", method = "GET")
    CheckNotificationMessageResult notificationMessageCheckStatusTrialTrialUserUserGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "trial", location = "path")
            String trial,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "notification_type", location = "query")
            String notificationType,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "Authorization", location = "header")
            String authorization,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "user", location = "path")
            String user,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "msg_id", location = "query")
            String msgId);
    
    /**
     * 
     * 
     * @param notificationType 
     * @param authorization 
     * @param msgId 
     * @return CheckNotificationMessageResult
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/notification_message/check-status/trial/{trial}/user/{user}", method = "OPTIONS")
    CheckNotificationMessageResult notificationMessageCheckStatusTrialTrialUserUserOptions(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "notification_type", location = "query")
            String notificationType,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "Authorization", location = "header")
            String authorization,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "msg_id", location = "query")
            String msgId);
    
    /**
     * 
     * 
     * @param authorization 
     * @param body 
     * @param msgId 
     * @return NotificationMessage
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/notification_message/create", method = "POST")
    NotificationMessage notificationMessageCreatePost(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "Authorization", location = "header")
            String authorization,
            NotificationMessage body,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "msg_id", location = "query")
            String msgId);
    
    /**
     * 
     * 
     * @param trial 
     * @param transactionId 
     * @param authorization 
     * @param user 
     * @param priority 
     * @param msgId 
     * @return NotificationMessage
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/notification_message/retry_notifications_in_processing_status/trial/{trial}/user/{user}/transaction_id/{transaction_id}", method = "PUT")
    NotificationMessage notificationMessageRetryNotificationsInProcessingStatusTrialTrialUserUserTransactionIdTransactionIdPut(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "trial", location = "path")
            String trial,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "transaction_id", location = "path")
            String transactionId,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "Authorization", location = "header")
            String authorization,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "user", location = "path")
            String user,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "priority", location = "query")
            String priority,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "msg_id", location = "query")
            String msgId);
    
    /**
     * 
     * 
     * @param authorization 
     * @param user 
     * @param msgId 
     * @param trial 
     * @param transactionId 
     * @return NotificationSNSObject
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/notification_message/run_notifications_instantly_without_schedule", method = "PUT")
    NotificationSNSObject notificationMessageRunNotificationsInstantlyWithoutSchedulePut(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "Authorization", location = "header")
            String authorization,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "user", location = "query")
            String user,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "msg_id", location = "query")
            String msgId,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "trial", location = "query")
            String trial,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "transaction_id", location = "query")
            String transactionId);
    
    /**
     * 
     * 
     * @param trial 
     * @param authorization 
     * @param user 
     * @param msgId 
     * @param notificationType 
     * @return ArrayOfNotificationMessages
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/notification_message/trial/{trial}/user/{user}", method = "GET")
    ArrayOfNotificationMessages notificationMessageTrialTrialUserUserGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "trial", location = "path")
            String trial,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "Authorization", location = "header")
            String authorization,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "user", location = "path")
            String user,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "msg_id", location = "query")
            String msgId,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "notification_type", location = "query")
            String notificationType);
    
    /**
     * 
     * 
     * @param trial 
     * @param transactionId 
     * @param authorization 
     * @param user 
     * @param msgId 
     * @return NotificationMessage
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/notification_message/trial/{trial}/user/{user}/transaction_id/{transaction_id}", method = "GET")
    NotificationMessage notificationMessageTrialTrialUserUserTransactionIdTransactionIdGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "trial", location = "path")
            String trial,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "transaction_id", location = "path")
            String transactionId,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "Authorization", location = "header")
            String authorization,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "user", location = "path")
            String user,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "msg_id", location = "query")
            String msgId);
    
    /**
     * 
     * 
     * @param notificationType 
     * @param authorization 
     * @param user 
     * @param trial 
     * @param createdAtBefore 
     * @param status 
     * @param msgId 
     * @return ArrayOfNotificationMessages
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/notification_message/update_status/trial/{trial}/user/{user}", method = "PUT")
    ArrayOfNotificationMessages notificationMessageUpdateStatusTrialTrialUserUserPut(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "notification_type", location = "query")
            String notificationType,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "Authorization", location = "header")
            String authorization,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "user", location = "path")
            String user,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "trial", location = "path")
            String trial,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "created_at_before", location = "query")
            String createdAtBefore,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "status", location = "query")
            String status,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "msg_id", location = "query")
            String msgId);
    
    /**
     * 
     * 
     * @param trial 
     * @param status 
     * @param transactionId 
     * @param authorization 
     * @param user 
     * @param msgId 
     * @return NotificationMessage
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/notification_message/update_status/trial/{trial}/user/{user}/transaction_id/{transaction_id}", method = "PUT")
    NotificationMessage notificationMessageUpdateStatusTrialTrialUserUserTransactionIdTransactionIdPut(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "trial", location = "path")
            String trial,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "status", location = "query")
            String status,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "transaction_id", location = "path")
            String transactionId,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "Authorization", location = "header")
            String authorization,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "user", location = "path")
            String user,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "msg_id", location = "query")
            String msgId);
    
    /**
     * 
     * 
     * @param trial 
     * @param authorization 
     * @param user 
     * @param msgId 
     * @return ArrayOfNotificationMessages
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/notification_message/update_token/trial/{trial}/user/{user}", method = "PUT")
    ArrayOfNotificationMessages notificationMessageUpdateTokenTrialTrialUserUserPut(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "trial", location = "path")
            String trial,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "Authorization", location = "header")
            String authorization,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "user", location = "path")
            String user,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "msg_id", location = "query")
            String msgId);
    
    /**
     * 
     * 
     * @param authorization 
     * @param user 
     * @param trial 
     * @param tzid 
     * @param scheduleId 
     * @param startDate 
     * @param msgId 
     * @param endDate 
     * @return ScheduleEventStatus
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/orchestration-service/v0/schedule_event_status/questionnaire/trials/{trial}/users/{user}", method = "GET")
    ScheduleEventStatus orchestrationServiceV0ScheduleEventStatusQuestionnaireTrialsTrialUsersUserGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "Authorization", location = "header")
            String authorization,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "user", location = "path")
            String user,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "trial", location = "path")
            String trial,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "tzid", location = "query")
            String tzid,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "schedule_id", location = "query")
            String scheduleId,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "start_date", location = "query")
            String startDate,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "msg_id", location = "query")
            String msgId,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "end_date", location = "query")
            String endDate);
    
    /**
     * 
     * 
     * @param trial 
     * @param user 
     * @return void
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/orchestration-service/v0/schedule_event_status/questionnaire/trials/{trial}/users/{user}", method = "OPTIONS")
    void orchestrationServiceV0ScheduleEventStatusQuestionnaireTrialsTrialUsersUserOptions(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "trial", location = "path")
            String trial,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "user", location = "path")
            String user);
    
    /**
     * 
     * 
     * @param needBackfill 
     * @param throttleDatetime 
     * @param authorization 
     * @param user 
     * @param trial 
     * @param actionType 
     * @param tzid 
     * @param msgId 
     * @return EventBackfillKeys
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/orchestration-service/v0/schedule_event_status/trigger-event-backfill/trials/{trial}/users/{user}", method = "PUT")
    EventBackfillKeys orchestrationServiceV0ScheduleEventStatusTriggerEventBackfillTrialsTrialUsersUserPut(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "need_backfill", location = "query")
            String needBackfill,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "throttle_datetime", location = "query")
            String throttleDatetime,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "Authorization", location = "header")
            String authorization,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "user", location = "path")
            String user,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "trial", location = "path")
            String trial,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "action_type", location = "query")
            String actionType,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "tzid", location = "query")
            String tzid,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "msg_id", location = "query")
            String msgId);
    
    /**
     * 
     * 
     * @return void
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/orchestration-service/v0/schedule_event_status/trigger-event-backfill/trials/{trial}/users/{user}", method = "OPTIONS")
    void orchestrationServiceV0ScheduleEventStatusTriggerEventBackfillTrialsTrialUsersUserOptions();
    
    /**
     * 
     * 
     * @param trial 
     * @param authorization 
     * @param user 
     * @param msgId 
     * @return UserLevelParamStatus
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/protocol_params/check_status/trial/{trial}/user/{user}", method = "GET")
    UserLevelParamStatus protocolParamsCheckStatusTrialTrialUserUserGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "trial", location = "path")
            String trial,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "Authorization", location = "header")
            String authorization,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "user", location = "path")
            String user,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "msg_id", location = "query")
            String msgId);
    
    /**
     * 
     * 
     * @return void
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/protocol_params/check_status/trial/{trial}/user/{user}", method = "OPTIONS")
    void protocolParamsCheckStatusTrialTrialUserUserOptions();
    
    /**
     * 
     * 
     * @param authorization 
     * @param body 
     * @param msgId 
     * @return ProtocolParams
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/protocol_params/create", method = "POST")
    ProtocolParams protocolParamsCreatePost(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "Authorization", location = "header")
            String authorization,
            ProtocolParams body,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "msg_id", location = "query")
            String msgId);
    
    /**
     * 
     * 
     * @return void
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/protocol_params/create", method = "OPTIONS")
    void protocolParamsCreateOptions();
    
    /**
     * 
     * 
     * @param trial 
     * @param authorization 
     * @param user 
     * @param msgId 
     * @return ProtocolParams
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/protocol_params/finish_protocol_params/trial/{trial}/user/{user}", method = "PUT")
    ProtocolParams protocolParamsFinishProtocolParamsTrialTrialUserUserPut(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "trial", location = "path")
            String trial,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "Authorization", location = "header")
            String authorization,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "user", location = "path")
            String user,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "msg_id", location = "query")
            String msgId);
    
    /**
     * 
     * 
     * @return void
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/protocol_params/finish_protocol_params/trial/{trial}/user/{user}", method = "OPTIONS")
    void protocolParamsFinishProtocolParamsTrialTrialUserUserOptions();
    
    /**
     * 
     * 
     * @param trial 
     * @param authorization 
     * @param user 
     * @param msgId 
     * @return ArrayOfProtocolParams
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/protocol_params/trial/{trial}/user/{user}", method = "GET")
    ArrayOfProtocolParams protocolParamsTrialTrialUserUserGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "trial", location = "path")
            String trial,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "Authorization", location = "header")
            String authorization,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "user", location = "path")
            String user,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "msg_id", location = "query")
            String msgId);
    
    /**
     * 
     * 
     * @return void
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/protocol_params/trial/{trial}/user/{user}", method = "OPTIONS")
    void protocolParamsTrialTrialUserUserOptions();
    
    /**
     * 
     * 
     * @param trial 
     * @param auditTrailId 
     * @param authorization 
     * @param user 
     * @param msgId 
     * @return ProtocolParams
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/protocol_params/trial/{trial}/user/{user}/audit_trail_id/{audit_trail_id}", method = "GET")
    ProtocolParams protocolParamsTrialTrialUserUserAuditTrailIdAuditTrailIdGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "trial", location = "path")
            String trial,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "audit_trail_id", location = "path")
            String auditTrailId,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "Authorization", location = "header")
            String authorization,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "user", location = "path")
            String user,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "msg_id", location = "query")
            String msgId);
    
    /**
     * 
     * 
     * @return void
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/protocol_params/trial/{trial}/user/{user}/audit_trail_id/{audit_trail_id}", method = "OPTIONS")
    void protocolParamsTrialTrialUserUserAuditTrailIdAuditTrailIdOptions();
    
    /**
     * 
     * 
     * @param trial 
     * @param authorization 
     * @param user 
     * @param msgId 
     * @param tzid 
     * @return ProtocolParams
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/protocol_params/trigger_protocol_params/trial/{trial}/user/{user}", method = "PUT")
    ProtocolParams protocolParamsTriggerProtocolParamsTrialTrialUserUserPut(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "trial", location = "path")
            String trial,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "Authorization", location = "header")
            String authorization,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "user", location = "path")
            String user,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "msg_id", location = "query")
            String msgId,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "tzid", location = "query")
            String tzid);
    
    /**
     * 
     * 
     * @return void
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/protocol_params/trigger_protocol_params/trial/{trial}/user/{user}", method = "OPTIONS")
    void protocolParamsTriggerProtocolParamsTrialTrialUserUserOptions();
    
    /**
     * 
     * 
     * @param msgId 
     * @param authorization 
     * @param auditTrailId 
     * @param body 
     * @return Questionnaire
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/questionnaires/create", method = "POST")
    Questionnaire questionnairesCreatePost(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "msg_id", location = "query")
            String msgId,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "Authorization", location = "header")
            String authorization,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "audit_trail_id", location = "query")
            String auditTrailId,
            Questionnaire body);
    
    /**
     * 
     * 
     * @param trial 
     * @param msgId 
     * @param authorization 
     * @return ArrayOfStrings
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/questionnaires/ids/{trial}", method = "GET")
    ArrayOfStrings questionnairesIdsTrialGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "trial", location = "path")
            String trial,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "msg_id", location = "query")
            String msgId,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "Authorization", location = "header")
            String authorization);
    
    /**
     * 
     * 
     * @param trial 
     * @param authorization 
     * @param msgId 
     * @return ArrayOfQuestionnaireInfo
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/questionnaires/infos/trials/{trial}", method = "GET")
    ArrayOfQuestionnaireInfo questionnairesInfosTrialsTrialGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "trial", location = "path")
            String trial,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "Authorization", location = "header")
            String authorization,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "msg_id", location = "query")
            String msgId);
    
    /**
     * 
     * 
     * @return void
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/questionnaires/infos/trials/{trial}", method = "OPTIONS")
    void questionnairesInfosTrialsTrialOptions();
    
    /**
     * 
     * 
     * @param questionnaireId 
     * @param language 
     * @param authorization 
     * @param msgId 
     * @return Questionnaire
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/questionnaires/language_support/questionnaire_id/{questionnaire_id}/language/{language}", method = "GET")
    Questionnaire questionnairesLanguageSupportQuestionnaireIdQuestionnaireIdLanguageLanguageGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "questionnaire_id", location = "path")
            String questionnaireId,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "language", location = "path")
            String language,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "Authorization", location = "header")
            String authorization,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "msg_id", location = "query")
            String msgId);
    
    /**
     * 
     * 
     * @param authorization 
     * @return Questionnaire
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/questionnaires/language_support/questionnaire_id/{questionnaire_id}/language/{language}", method = "OPTIONS")
    Questionnaire questionnairesLanguageSupportQuestionnaireIdQuestionnaireIdLanguageLanguageOptions(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "Authorization", location = "header")
            String authorization);
    
    /**
     * 
     * 
     * @param date 
     * @param trialId 
     * @param inClinic 
     * @param patientId 
     * @param authorization 
     * @return ArrayOfUnansweredQuestionnaires
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/questionnaires/unanswered", method = "GET")
    ArrayOfUnansweredQuestionnaires questionnairesUnansweredGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "date", location = "query")
            String date,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "trial_id", location = "query")
            String trialId,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "in_clinic", location = "query")
            String inClinic,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "patient_id", location = "query")
            String patientId,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "Authorization", location = "header")
            String authorization);
    
    /**
     * 
     * 
     * @return void
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/questionnaires/unanswered", method = "OPTIONS")
    void questionnairesUnansweredOptions();
    
    /**
     * 
     * 
     * @param questionnaireId 
     * @param msgId 
     * @param authorization 
     * @return Questionnaire
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/questionnaires/{questionnaire_id}", method = "GET")
    Questionnaire questionnairesQuestionnaireIdGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "questionnaire_id", location = "path")
            String questionnaireId,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "msg_id", location = "query")
            String msgId,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "Authorization", location = "header")
            String authorization);
    
    /**
     * 
     * 
     * @param msgId 
     * @param questionnaireId 
     * @param authorization 
     * @param auditTrailId 
     * @param body 
     * @return Questionnaire
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/questionnaires/{questionnaire_id}", method = "PUT")
    Questionnaire questionnairesQuestionnaireIdPut(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "msg_id", location = "query")
            String msgId,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "questionnaire_id", location = "path")
            String questionnaireId,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "Authorization", location = "header")
            String authorization,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "audit_trail_id", location = "query")
            String auditTrailId,
            Questionnaire body);
    
    /**
     * 
     * 
     * @param msgId 
     * @param questionnaireId 
     * @param authorization 
     * @param auditTrailId 
     * @return void
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/questionnaires/{questionnaire_id}", method = "DELETE")
    void questionnairesQuestionnaireIdDelete(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "msg_id", location = "query")
            String msgId,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "questionnaire_id", location = "path")
            String questionnaireId,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "Authorization", location = "header")
            String authorization,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "audit_trail_id", location = "query")
            String auditTrailId);
    
    /**
     * 
     * 
     * @param msgId 
     * @param authorization 
     * @param body 
     * @return TranslationDetails
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/translation_details/save", method = "PUT")
    TranslationDetails translationDetailsSavePut(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "msg_id", location = "query")
            String msgId,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "Authorization", location = "header")
            String authorization,
            TranslationDetails body);
    
    /**
     * 
     * 
     * @return void
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/translation_details/save", method = "OPTIONS")
    void translationDetailsSaveOptions();
    
    /**
     * 
     * 
     * @param translationKeyId 
     * @param authorization 
     * @param msgId 
     * @return ArrayOfTranslationDetails
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/translation_details/translation_key_id/{translation_key_id}", method = "GET")
    ArrayOfTranslationDetails translationDetailsTranslationKeyIdTranslationKeyIdGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "translation_key_id", location = "path")
            String translationKeyId,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "Authorization", location = "header")
            String authorization,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "msg_id", location = "query")
            String msgId);
    
    /**
     * 
     * 
     * @param translationKeyId 
     * @return void
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/translation_details/translation_key_id/{translation_key_id}", method = "OPTIONS")
    void translationDetailsTranslationKeyIdTranslationKeyIdOptions(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "translation_key_id", location = "path")
            String translationKeyId);
    
    /**
     * 
     * 
     * @param translationKeyId 
     * @param language 
     * @param authorization 
     * @return TranslationDetails
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/translation_details/translation_key_id/{translation_key_id}/language/{language}", method = "GET")
    TranslationDetails translationDetailsTranslationKeyIdTranslationKeyIdLanguageLanguageGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "translation_key_id", location = "path")
            String translationKeyId,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "language", location = "path")
            String language,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "Authorization", location = "header")
            String authorization);
    
    /**
     * 
     * 
     * @param translationKeyId 
     * @param language 
     * @param authorization 
     * @param msgId 
     * @return void
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/translation_details/translation_key_id/{translation_key_id}/language/{language}", method = "DELETE")
    void translationDetailsTranslationKeyIdTranslationKeyIdLanguageLanguageDelete(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "translation_key_id", location = "path")
            String translationKeyId,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "language", location = "path")
            String language,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "Authorization", location = "header")
            String authorization,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "msg_id", location = "query")
            String msgId);
    
    /**
     * 
     * 
     * @return void
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/translation_details/translation_key_id/{translation_key_id}/language/{language}", method = "OPTIONS")
    void translationDetailsTranslationKeyIdTranslationKeyIdLanguageLanguageOptions();
    
    /**
     * 
     * 
     * @param body 
     * @param authorization 
     * @return VideoConference
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/video_conference_service/v0/video_conferences", method = "PUT")
    VideoConference videoConferenceServiceV0VideoConferencesPut(
            VideoConference body,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "Authorization", location = "header")
            String authorization);
    
    /**
     * 
     * 
     * @param body 
     * @param authorization 
     * @return VideoConference
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/video_conference_service/v0/video_conferences", method = "POST")
    VideoConference videoConferenceServiceV0VideoConferencesPost(
            VideoConference body,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "Authorization", location = "header")
            String authorization);
    
    /**
     * 
     * 
     * @return Empty
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/video_conference_service/v0/video_conferences", method = "OPTIONS")
    Empty videoConferenceServiceV0VideoConferencesOptions();
    
    /**
     * 
     * 
     * @param body 
     * @param authorization 
     * @return ConferenceCompleteResult
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/video_conference_service/v0/video_conferences/complete", method = "PUT")
    ConferenceCompleteResult videoConferenceServiceV0VideoConferencesCompletePut(
            ConferenceComplete body,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "Authorization", location = "header")
            String authorization);
    
    /**
     * 
     * 
     * @return Empty
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/video_conference_service/v0/video_conferences/complete", method = "OPTIONS")
    Empty videoConferenceServiceV0VideoConferencesCompleteOptions();
    
    /**
     * 
     * 
     * @param body 
     * @param recording 
     * @param authorization 
     * @param createRoom 
     * @return VideoRoomAccess
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/video_conference_service/v0/video_conferences/host/access_token", method = "POST")
    VideoRoomAccess videoConferenceServiceV0VideoConferencesHostAccessTokenPost(
            HostAccessRequest body,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "recording", location = "query")
            String recording,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "Authorization", location = "header")
            String authorization,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "create_room", location = "query")
            String createRoom);
    
    /**
     * 
     * 
     * @return Empty
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/video_conference_service/v0/video_conferences/host/access_token", method = "OPTIONS")
    Empty videoConferenceServiceV0VideoConferencesHostAccessTokenOptions();
    
    /**
     * 
     * 
     * @param body 
     * @param authorization 
     * @return VideoRoomAccess
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/video_conference_service/v0/video_conferences/participant/access_token", method = "POST")
    VideoRoomAccess videoConferenceServiceV0VideoConferencesParticipantAccessTokenPost(
            ParticipantAccessRequest body,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "Authorization", location = "header")
            String authorization);
    
    /**
     * 
     * 
     * @return Empty
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/video_conference_service/v0/video_conferences/participant/access_token", method = "OPTIONS")
    Empty videoConferenceServiceV0VideoConferencesParticipantAccessTokenOptions();
    
    /**
     * 
     * 
     * @param trial 
     * @param participant 
     * @param conferenceId 
     * @param authorization 
     * @return VideoConference
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/video_conference_service/v0/video_conferences/trials/{trial}/participants/{participant}/conferences/{conference_id}", method = "GET")
    VideoConference videoConferenceServiceV0VideoConferencesTrialsTrialParticipantsParticipantConferencesConferenceIdGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "trial", location = "path")
            String trial,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "participant", location = "path")
            String participant,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "conference_id", location = "path")
            String conferenceId,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "Authorization", location = "header")
            String authorization);
    
    /**
     * 
     * 
     * @return Empty
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/video_conference_service/v0/video_conferences/trials/{trial}/participants/{participant}/conferences/{conference_id}", method = "OPTIONS")
    Empty videoConferenceServiceV0VideoConferencesTrialsTrialParticipantsParticipantConferencesConferenceIdOptions();
    
}

