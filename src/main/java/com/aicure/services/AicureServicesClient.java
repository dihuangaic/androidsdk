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

import com.aicure.services.model.Alarm;
import com.aicure.services.model.CustomizedError;
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
import com.aicure.services.model.Medication;
import com.aicure.services.model.MedicationAlgorithm;
import com.aicure.services.model.ArrayOfAlgorithmModel;
import com.aicure.services.model.NotificationMessage;
import com.aicure.services.model.NotificationSNSObject;
import com.aicure.services.model.ArrayOfNotificationMessages;
import com.aicure.services.model.Questionnaire;
import com.aicure.services.model.ArrayOfUnansweredQuestionnaires;


@com.amazonaws.mobileconnectors.apigateway.annotation.Service(endpoint = "https://yq46sgsspb.execute-api.us-west-2.amazonaws.com/dev")
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
     * @param msgId 
     * @param authorization 
     * @param auditTrailId 
     * @param body 
     * @return Medication
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/medications/create", method = "POST")
    Medication medicationsCreatePost(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "msg_id", location = "query")
            String msgId,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "Authorization", location = "header")
            String authorization,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "audit_trail_id", location = "query")
            String auditTrailId,
            Medication body);
    
    /**
     * 
     * 
     * @param trial 
     * @param msgId 
     * @param authorization 
     * @return ArrayOfStrings
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/medications/ids/{trial}", method = "GET")
    ArrayOfStrings medicationsIdsTrialGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "trial", location = "path")
            String trial,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "msg_id", location = "query")
            String msgId,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "Authorization", location = "header")
            String authorization);
    
    /**
     * 
     * 
     * @param msgId 
     * @param medicationId 
     * @param authorization 
     * @return MedicationAlgorithm
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/medications/medication_algorithms/{medication_id}", method = "GET")
    MedicationAlgorithm medicationsMedicationAlgorithmsMedicationIdGet(
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
     * @param authorization 
     * @param auditTrailId 
     * @param body 
     * @return MedicationAlgorithm
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/medications/medication_algorithms/{medication_id}", method = "PUT")
    MedicationAlgorithm medicationsMedicationAlgorithmsMedicationIdPut(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "msg_id", location = "query")
            String msgId,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "medication_id", location = "path")
            String medicationId,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "Authorization", location = "header")
            String authorization,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "audit_trail_id", location = "query")
            String auditTrailId,
            MedicationAlgorithm body);
    
    /**
     * 
     * 
     * @param msgId 
     * @param medicationId 
     * @param authorization 
     * @param auditTrailId 
     * @param body 
     * @return MedicationAlgorithm
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/medications/medication_algorithms/{medication_id}/models", method = "PUT")
    MedicationAlgorithm medicationsMedicationAlgorithmsMedicationIdModelsPut(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "msg_id", location = "query")
            String msgId,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "medication_id", location = "path")
            String medicationId,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "Authorization", location = "header")
            String authorization,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "audit_trail_id", location = "query")
            String auditTrailId,
            ArrayOfAlgorithmModel body);
    
    /**
     * 
     * 
     * @param msgId 
     * @param algorithmModelId 
     * @param medicationId 
     * @param authorization 
     * @param auditTrailId 
     * @return void
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/medications/medication_algorithms/{medication_id}/models/{algorithm_model_id}", method = "DELETE")
    void medicationsMedicationAlgorithmsMedicationIdModelsAlgorithmModelIdDelete(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "msg_id", location = "query")
            String msgId,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "algorithm_model_id", location = "path")
            String algorithmModelId,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "medication_id", location = "path")
            String medicationId,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "Authorization", location = "header")
            String authorization,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "audit_trail_id", location = "query")
            String auditTrailId);
    
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
     * @param authorization 
     * @param auditTrailId 
     * @param body 
     * @return Medication
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/medications/{medication_id}", method = "PUT")
    Medication medicationsMedicationIdPut(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "msg_id", location = "query")
            String msgId,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "medication_id", location = "path")
            String medicationId,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "Authorization", location = "header")
            String authorization,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "audit_trail_id", location = "query")
            String auditTrailId,
            Medication body);
    
    /**
     * 
     * 
     * @param msgId 
     * @param medicationId 
     * @param authorization 
     * @param auditTrailId 
     * @return void
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/medications/{medication_id}", method = "DELETE")
    void medicationsMedicationIdDelete(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "msg_id", location = "query")
            String msgId,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "medication_id", location = "path")
            String medicationId,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "Authorization", location = "header")
            String authorization,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "audit_trail_id", location = "query")
            String auditTrailId);
    
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
     * @param questionnaireId 
     * @param language 
     * @param authorization 
     * @return Questionnaire
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/questionnaires/language_support/questionnaire_id/{questionnaire_id}/language/{language}", method = "GET")
    Questionnaire questionnairesLanguageSupportQuestionnaireIdQuestionnaireIdLanguageLanguageGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "questionnaire_id", location = "path")
            String questionnaireId,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "language", location = "path")
            String language,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "Authorization", location = "header")
            String authorization);
    
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
    
}

