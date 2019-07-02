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
import com.aicure.services.model.Health;
import com.aicure.services.model.StudyCumulativeAdherenceDto;
import com.aicure.services.model.CountryCumulativeAdherenceDto;
import com.aicure.services.model.PatientCumulativeAdherenceDto;
import com.aicure.services.model.SiteCumulativeAdherenceDto;
import com.aicure.services.model.PatientRollingAdherenceDto;
import com.aicure.services.model.CountryStudyWeekAdherenceDto;
import com.aicure.services.model.PatientStudyWeekAdherenceDto;
import com.aicure.services.model.SiteStudyWeekAdherenceDto;
import com.aicure.services.model.StudyStudyWeekAdherenceDto;
import com.aicure.services.model.PatientWeekdayAdherenceDto;
import com.aicure.services.model.PatientXDayCumulativeAdherenceDto;
import com.aicure.services.model.PatientXDayWeekdayAdherenceDto;
import com.aicure.services.model.StudyInterventionDto;
import com.aicure.services.model.CountryInterventionDto;
import com.aicure.services.model.SiteInterventionDto;
import com.aicure.services.model.PatientInterventionDto;
import com.aicure.services.model.StudyInterventionSummaryDto;
import com.aicure.services.model.CountryInterventionSummaryDto;
import com.aicure.services.model.SiteInterventionSummaryDto;
import com.aicure.services.model.ListOfStrings;
import com.aicure.services.model.ArrayOfActivityDto;
import com.aicure.services.model.ProtectionLevelAveragesDto;
import com.aicure.services.model.EncountersByProtectionLevelDto;
import com.aicure.services.model.PartnerStatusDto;
import com.aicure.services.model.ArrayOfPillPercentageInHourOfDayDto;
import com.aicure.services.model.VersionDto;
import com.aicure.services.model.QuestionnaireEvent;
import com.aicure.services.model.ArrayOfQuestionnaireEvent;
import com.aicure.services.model.TakeMedicationEvent;
import com.aicure.services.model.ArrayOfKitNum;
import com.aicure.services.model.ArrayOfKitNumKey;
import com.aicure.services.model.Medication;
import com.aicure.services.model.MedicationAlgorithm;
import com.aicure.services.model.ArrayOfAlgorithmModel;
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
import com.aicure.services.model.ArrayOfUnansweredQuestionnaires;
import com.aicure.services.model.TranslationDetails;
import com.aicure.services.model.ArrayOfTranslationDetails;


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
     * @return Health
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/health", method = "GET")
    Health dashboardServiceHealthGet();
    
    /**
     * 
     * 
     * @return void
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/health", method = "OPTIONS")
    void dashboardServiceHealthOptions();
    
    /**
     * 
     * 
     * @param message 
     * @param logger 
     * @param args 
     * @param level 
     * @param exceptionMsg 
     * @return void
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/hello/logs", method = "GET")
    void dashboardServiceHelloLogsGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "message", location = "query")
            String message,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "logger", location = "query")
            String logger,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "args", location = "query")
            String args,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "level", location = "query")
            String level,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "exceptionMsg", location = "query")
            String exceptionMsg);
    
    /**
     * 
     * 
     * @return void
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/hello/logs", method = "OPTIONS")
    void dashboardServiceHelloLogsOptions();
    
    /**
     * 
     * 
     * @return void
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/openapi.json", method = "GET")
    void dashboardServiceOpenapiJsonGet();
    
    /**
     * 
     * 
     * @return void
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/openapi.json", method = "OPTIONS")
    void dashboardServiceOpenapiJsonOptions();
    
    /**
     * 
     * 
     * @param resource 
     * @return void
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/swagger/{resource}", method = "GET")
    void dashboardServiceSwaggerResourceGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "resource", location = "path")
            String resource);
    
    /**
     * 
     * 
     * @return void
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/swagger/{resource}", method = "OPTIONS")
    void dashboardServiceSwaggerResourceOptions();
    
    /**
     * 
     * 
     * @param studyUuid 
     * @return StudyCumulativeAdherenceDto
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/adherence/cumulative/studies/{study_uuid}/calculations/ai-cure", method = "GET")
    StudyCumulativeAdherenceDto dashboardServiceV1AdherenceCumulativeStudiesStudyUuidCalculationsAiCureGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "study_uuid", location = "path")
            String studyUuid);
    
    /**
     * 
     * 
     * @return void
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/adherence/cumulative/studies/{study_uuid}/calculations/ai-cure", method = "OPTIONS")
    void dashboardServiceV1AdherenceCumulativeStudiesStudyUuidCalculationsAiCureOptions();
    
    /**
     * 
     * 
     * @param studyUuid 
     * @return StudyCumulativeAdherenceDto
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/adherence/cumulative/studies/{study_uuid}/calculations/overall", method = "GET")
    StudyCumulativeAdherenceDto dashboardServiceV1AdherenceCumulativeStudiesStudyUuidCalculationsOverallGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "study_uuid", location = "path")
            String studyUuid);
    
    /**
     * 
     * 
     * @return void
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/adherence/cumulative/studies/{study_uuid}/calculations/overall", method = "OPTIONS")
    void dashboardServiceV1AdherenceCumulativeStudiesStudyUuidCalculationsOverallOptions();
    
    /**
     * 
     * 
     * @param countryCode 
     * @param studyUuid 
     * @return CountryCumulativeAdherenceDto
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/adherence/cumulative/studies/{study_uuid}/countries/{country_code}/calculations/ai-cure", method = "GET")
    CountryCumulativeAdherenceDto dashboardServiceV1AdherenceCumulativeStudiesStudyUuidCountriesCountryCodeCalculationsAiCureGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "country_code", location = "path")
            String countryCode,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "study_uuid", location = "path")
            String studyUuid);
    
    /**
     * 
     * 
     * @return void
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/adherence/cumulative/studies/{study_uuid}/countries/{country_code}/calculations/ai-cure", method = "OPTIONS")
    void dashboardServiceV1AdherenceCumulativeStudiesStudyUuidCountriesCountryCodeCalculationsAiCureOptions();
    
    /**
     * 
     * 
     * @param countryCode 
     * @param studyUuid 
     * @return CountryCumulativeAdherenceDto
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/adherence/cumulative/studies/{study_uuid}/countries/{country_code}/calculations/overall", method = "GET")
    CountryCumulativeAdherenceDto dashboardServiceV1AdherenceCumulativeStudiesStudyUuidCountriesCountryCodeCalculationsOverallGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "country_code", location = "path")
            String countryCode,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "study_uuid", location = "path")
            String studyUuid);
    
    /**
     * 
     * 
     * @return void
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/adherence/cumulative/studies/{study_uuid}/countries/{country_code}/calculations/overall", method = "OPTIONS")
    void dashboardServiceV1AdherenceCumulativeStudiesStudyUuidCountriesCountryCodeCalculationsOverallOptions();
    
    /**
     * 
     * 
     * @param studyUuid 
     * @param patientUuid 
     * @param when 
     * @return PatientCumulativeAdherenceDto
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/adherence/cumulative/studies/{study_uuid}/patients/{patient_uuid}/calculations/ai-cure", method = "GET")
    PatientCumulativeAdherenceDto dashboardServiceV1AdherenceCumulativeStudiesStudyUuidPatientsPatientUuidCalculationsAiCureGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "study_uuid", location = "path")
            String studyUuid,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "patient_uuid", location = "path")
            String patientUuid,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "when", location = "query")
            String when);
    
    /**
     * 
     * 
     * @return void
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/adherence/cumulative/studies/{study_uuid}/patients/{patient_uuid}/calculations/ai-cure", method = "OPTIONS")
    void dashboardServiceV1AdherenceCumulativeStudiesStudyUuidPatientsPatientUuidCalculationsAiCureOptions();
    
    /**
     * 
     * 
     * @param studyUuid 
     * @param patientUuid 
     * @param when 
     * @return PatientCumulativeAdherenceDto
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/adherence/cumulative/studies/{study_uuid}/patients/{patient_uuid}/calculations/overall", method = "GET")
    PatientCumulativeAdherenceDto dashboardServiceV1AdherenceCumulativeStudiesStudyUuidPatientsPatientUuidCalculationsOverallGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "study_uuid", location = "path")
            String studyUuid,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "patient_uuid", location = "path")
            String patientUuid,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "when", location = "query")
            String when);
    
    /**
     * 
     * 
     * @return void
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/adherence/cumulative/studies/{study_uuid}/patients/{patient_uuid}/calculations/overall", method = "OPTIONS")
    void dashboardServiceV1AdherenceCumulativeStudiesStudyUuidPatientsPatientUuidCalculationsOverallOptions();
    
    /**
     * 
     * 
     * @param studyUuid 
     * @param siteUuid 
     * @return SiteCumulativeAdherenceDto
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/adherence/cumulative/studies/{study_uuid}/sites/{site_uuid}/calculations/ai-cure", method = "GET")
    SiteCumulativeAdherenceDto dashboardServiceV1AdherenceCumulativeStudiesStudyUuidSitesSiteUuidCalculationsAiCureGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "study_uuid", location = "path")
            String studyUuid,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "site_uuid", location = "path")
            String siteUuid);
    
    /**
     * 
     * 
     * @return void
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/adherence/cumulative/studies/{study_uuid}/sites/{site_uuid}/calculations/ai-cure", method = "OPTIONS")
    void dashboardServiceV1AdherenceCumulativeStudiesStudyUuidSitesSiteUuidCalculationsAiCureOptions();
    
    /**
     * 
     * 
     * @param studyUuid 
     * @param siteUuid 
     * @return SiteCumulativeAdherenceDto
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/adherence/cumulative/studies/{study_uuid}/sites/{site_uuid}/calculations/overall", method = "GET")
    SiteCumulativeAdherenceDto dashboardServiceV1AdherenceCumulativeStudiesStudyUuidSitesSiteUuidCalculationsOverallGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "study_uuid", location = "path")
            String studyUuid,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "site_uuid", location = "path")
            String siteUuid);
    
    /**
     * 
     * 
     * @return void
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/adherence/cumulative/studies/{study_uuid}/sites/{site_uuid}/calculations/overall", method = "OPTIONS")
    void dashboardServiceV1AdherenceCumulativeStudiesStudyUuidSitesSiteUuidCalculationsOverallOptions();
    
    /**
     * 
     * 
     * @param day 
     * @param patientUuid 
     * @param rollingDays 
     * @param studyUuid 
     * @return PatientRollingAdherenceDto
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/adherence/rolling/studies/{study_uuid}/patients/{patient_uuid}/day/{day}/rolling-days/{rolling_days}/calculations/ai-cure", method = "GET")
    PatientRollingAdherenceDto dashboardServiceV1AdherenceRollingStudiesStudyUuidPatientsPatientUuidDayDayRollingDaysRollingDaysCalculationsAiCureGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "day", location = "path")
            String day,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "patient_uuid", location = "path")
            String patientUuid,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "rolling_days", location = "path")
            String rollingDays,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "study_uuid", location = "path")
            String studyUuid);
    
    /**
     * 
     * 
     * @return void
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/adherence/rolling/studies/{study_uuid}/patients/{patient_uuid}/day/{day}/rolling-days/{rolling_days}/calculations/ai-cure", method = "OPTIONS")
    void dashboardServiceV1AdherenceRollingStudiesStudyUuidPatientsPatientUuidDayDayRollingDaysRollingDaysCalculationsAiCureOptions();
    
    /**
     * 
     * 
     * @param day 
     * @param patientUuid 
     * @param rollingDays 
     * @param studyUuid 
     * @return PatientRollingAdherenceDto
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/adherence/rolling/studies/{study_uuid}/patients/{patient_uuid}/day/{day}/rolling-days/{rolling_days}/calculations/overall", method = "GET")
    PatientRollingAdherenceDto dashboardServiceV1AdherenceRollingStudiesStudyUuidPatientsPatientUuidDayDayRollingDaysRollingDaysCalculationsOverallGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "day", location = "path")
            String day,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "patient_uuid", location = "path")
            String patientUuid,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "rolling_days", location = "path")
            String rollingDays,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "study_uuid", location = "path")
            String studyUuid);
    
    /**
     * 
     * 
     * @return void
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/adherence/rolling/studies/{study_uuid}/patients/{patient_uuid}/day/{day}/rolling-days/{rolling_days}/calculations/overall", method = "OPTIONS")
    void dashboardServiceV1AdherenceRollingStudiesStudyUuidPatientsPatientUuidDayDayRollingDaysRollingDaysCalculationsOverallOptions();
    
    /**
     * 
     * 
     * @param countryCode 
     * @param studyUuid 
     * @param studyWeek 
     * @return CountryStudyWeekAdherenceDto
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/adherence/study-week/studies/{study_uuid}/countries/{country_code}/week/{study_week}/calculations/ai-cure", method = "GET")
    CountryStudyWeekAdherenceDto dashboardServiceV1AdherenceStudyWeekStudiesStudyUuidCountriesCountryCodeWeekStudyWeekCalculationsAiCureGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "country_code", location = "path")
            String countryCode,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "study_uuid", location = "path")
            String studyUuid,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "study_week", location = "path")
            String studyWeek);
    
    /**
     * 
     * 
     * @return void
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/adherence/study-week/studies/{study_uuid}/countries/{country_code}/week/{study_week}/calculations/ai-cure", method = "OPTIONS")
    void dashboardServiceV1AdherenceStudyWeekStudiesStudyUuidCountriesCountryCodeWeekStudyWeekCalculationsAiCureOptions();
    
    /**
     * 
     * 
     * @param countryCode 
     * @param studyUuid 
     * @param studyWeek 
     * @return CountryStudyWeekAdherenceDto
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/adherence/study-week/studies/{study_uuid}/countries/{country_code}/week/{study_week}/calculations/overall", method = "GET")
    CountryStudyWeekAdherenceDto dashboardServiceV1AdherenceStudyWeekStudiesStudyUuidCountriesCountryCodeWeekStudyWeekCalculationsOverallGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "country_code", location = "path")
            String countryCode,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "study_uuid", location = "path")
            String studyUuid,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "study_week", location = "path")
            String studyWeek);
    
    /**
     * 
     * 
     * @return void
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/adherence/study-week/studies/{study_uuid}/countries/{country_code}/week/{study_week}/calculations/overall", method = "OPTIONS")
    void dashboardServiceV1AdherenceStudyWeekStudiesStudyUuidCountriesCountryCodeWeekStudyWeekCalculationsOverallOptions();
    
    /**
     * 
     * 
     * @param studyUuid 
     * @param patientUuid 
     * @param studyWeek 
     * @return PatientStudyWeekAdherenceDto
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/adherence/study-week/studies/{study_uuid}/patients/{patient_uuid}/week/{study_week}/calculations/ai-cure", method = "GET")
    PatientStudyWeekAdherenceDto dashboardServiceV1AdherenceStudyWeekStudiesStudyUuidPatientsPatientUuidWeekStudyWeekCalculationsAiCureGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "study_uuid", location = "path")
            String studyUuid,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "patient_uuid", location = "path")
            String patientUuid,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "study_week", location = "path")
            String studyWeek);
    
    /**
     * 
     * 
     * @return void
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/adherence/study-week/studies/{study_uuid}/patients/{patient_uuid}/week/{study_week}/calculations/ai-cure", method = "OPTIONS")
    void dashboardServiceV1AdherenceStudyWeekStudiesStudyUuidPatientsPatientUuidWeekStudyWeekCalculationsAiCureOptions();
    
    /**
     * 
     * 
     * @param studyUuid 
     * @param patientUuid 
     * @param studyWeek 
     * @return PatientStudyWeekAdherenceDto
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/adherence/study-week/studies/{study_uuid}/patients/{patient_uuid}/week/{study_week}/calculations/overall", method = "GET")
    PatientStudyWeekAdherenceDto dashboardServiceV1AdherenceStudyWeekStudiesStudyUuidPatientsPatientUuidWeekStudyWeekCalculationsOverallGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "study_uuid", location = "path")
            String studyUuid,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "patient_uuid", location = "path")
            String patientUuid,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "study_week", location = "path")
            String studyWeek);
    
    /**
     * 
     * 
     * @return void
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/adherence/study-week/studies/{study_uuid}/patients/{patient_uuid}/week/{study_week}/calculations/overall", method = "OPTIONS")
    void dashboardServiceV1AdherenceStudyWeekStudiesStudyUuidPatientsPatientUuidWeekStudyWeekCalculationsOverallOptions();
    
    /**
     * 
     * 
     * @param studyUuid 
     * @param studyWeek 
     * @param siteUuid 
     * @return SiteStudyWeekAdherenceDto
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/adherence/study-week/studies/{study_uuid}/sites/{site_uuid}/week/{study_week}/calculations/ai-cure", method = "GET")
    SiteStudyWeekAdherenceDto dashboardServiceV1AdherenceStudyWeekStudiesStudyUuidSitesSiteUuidWeekStudyWeekCalculationsAiCureGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "study_uuid", location = "path")
            String studyUuid,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "study_week", location = "path")
            String studyWeek,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "site_uuid", location = "path")
            String siteUuid);
    
    /**
     * 
     * 
     * @return void
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/adherence/study-week/studies/{study_uuid}/sites/{site_uuid}/week/{study_week}/calculations/ai-cure", method = "OPTIONS")
    void dashboardServiceV1AdherenceStudyWeekStudiesStudyUuidSitesSiteUuidWeekStudyWeekCalculationsAiCureOptions();
    
    /**
     * 
     * 
     * @param studyUuid 
     * @param studyWeek 
     * @param siteUuid 
     * @return SiteStudyWeekAdherenceDto
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/adherence/study-week/studies/{study_uuid}/sites/{site_uuid}/week/{study_week}/calculations/overall", method = "GET")
    SiteStudyWeekAdherenceDto dashboardServiceV1AdherenceStudyWeekStudiesStudyUuidSitesSiteUuidWeekStudyWeekCalculationsOverallGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "study_uuid", location = "path")
            String studyUuid,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "study_week", location = "path")
            String studyWeek,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "site_uuid", location = "path")
            String siteUuid);
    
    /**
     * 
     * 
     * @return void
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/adherence/study-week/studies/{study_uuid}/sites/{site_uuid}/week/{study_week}/calculations/overall", method = "OPTIONS")
    void dashboardServiceV1AdherenceStudyWeekStudiesStudyUuidSitesSiteUuidWeekStudyWeekCalculationsOverallOptions();
    
    /**
     * 
     * 
     * @param studyUuid 
     * @param studyWeek 
     * @return StudyStudyWeekAdherenceDto
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/adherence/study-week/studies/{study_uuid}/week/{study_week}/calculations/ai-cure", method = "GET")
    StudyStudyWeekAdherenceDto dashboardServiceV1AdherenceStudyWeekStudiesStudyUuidWeekStudyWeekCalculationsAiCureGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "study_uuid", location = "path")
            String studyUuid,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "study_week", location = "path")
            String studyWeek);
    
    /**
     * 
     * 
     * @return void
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/adherence/study-week/studies/{study_uuid}/week/{study_week}/calculations/ai-cure", method = "OPTIONS")
    void dashboardServiceV1AdherenceStudyWeekStudiesStudyUuidWeekStudyWeekCalculationsAiCureOptions();
    
    /**
     * 
     * 
     * @param studyUuid 
     * @param studyWeek 
     * @return StudyStudyWeekAdherenceDto
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/adherence/study-week/studies/{study_uuid}/week/{study_week}/calculations/overall", method = "GET")
    StudyStudyWeekAdherenceDto dashboardServiceV1AdherenceStudyWeekStudiesStudyUuidWeekStudyWeekCalculationsOverallGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "study_uuid", location = "path")
            String studyUuid,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "study_week", location = "path")
            String studyWeek);
    
    /**
     * 
     * 
     * @return void
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/adherence/study-week/studies/{study_uuid}/week/{study_week}/calculations/overall", method = "OPTIONS")
    void dashboardServiceV1AdherenceStudyWeekStudiesStudyUuidWeekStudyWeekCalculationsOverallOptions();
    
    /**
     * 
     * 
     * @param patientUuid 
     * @param studyUuid 
     * @param dayOfWeek 
     * @param when 
     * @return PatientWeekdayAdherenceDto
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/adherence/weekday/studies/{study_uuid}/patients/{patient_uuid}/day-of-week/{day_of_week}/calculations/ai-cure", method = "GET")
    PatientWeekdayAdherenceDto dashboardServiceV1AdherenceWeekdayStudiesStudyUuidPatientsPatientUuidDayOfWeekDayOfWeekCalculationsAiCureGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "patient_uuid", location = "path")
            String patientUuid,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "study_uuid", location = "path")
            String studyUuid,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "day_of_week", location = "path")
            String dayOfWeek,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "when", location = "query")
            String when);
    
    /**
     * 
     * 
     * @return void
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/adherence/weekday/studies/{study_uuid}/patients/{patient_uuid}/day-of-week/{day_of_week}/calculations/ai-cure", method = "OPTIONS")
    void dashboardServiceV1AdherenceWeekdayStudiesStudyUuidPatientsPatientUuidDayOfWeekDayOfWeekCalculationsAiCureOptions();
    
    /**
     * 
     * 
     * @param patientUuid 
     * @param studyUuid 
     * @param dayOfWeek 
     * @param when 
     * @return PatientWeekdayAdherenceDto
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/adherence/weekday/studies/{study_uuid}/patients/{patient_uuid}/day-of-week/{day_of_week}/calculations/overall", method = "GET")
    PatientWeekdayAdherenceDto dashboardServiceV1AdherenceWeekdayStudiesStudyUuidPatientsPatientUuidDayOfWeekDayOfWeekCalculationsOverallGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "patient_uuid", location = "path")
            String patientUuid,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "study_uuid", location = "path")
            String studyUuid,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "day_of_week", location = "path")
            String dayOfWeek,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "when", location = "query")
            String when);
    
    /**
     * 
     * 
     * @return void
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/adherence/weekday/studies/{study_uuid}/patients/{patient_uuid}/day-of-week/{day_of_week}/calculations/overall", method = "OPTIONS")
    void dashboardServiceV1AdherenceWeekdayStudiesStudyUuidPatientsPatientUuidDayOfWeekDayOfWeekCalculationsOverallOptions();
    
    /**
     * 
     * 
     * @param patientUuid 
     * @param days 
     * @param studyUuid 
     * @param when 
     * @return PatientXDayCumulativeAdherenceDto
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/adherence/x-day-cumulative/studies/{study_uuid}/patients/{patient_uuid}/days/{days}/calculations/ai-cure", method = "GET")
    PatientXDayCumulativeAdherenceDto dashboardServiceV1AdherenceXDayCumulativeStudiesStudyUuidPatientsPatientUuidDaysDaysCalculationsAiCureGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "patient_uuid", location = "path")
            String patientUuid,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "days", location = "path")
            String days,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "study_uuid", location = "path")
            String studyUuid,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "when", location = "query")
            String when);
    
    /**
     * 
     * 
     * @return void
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/adherence/x-day-cumulative/studies/{study_uuid}/patients/{patient_uuid}/days/{days}/calculations/ai-cure", method = "OPTIONS")
    void dashboardServiceV1AdherenceXDayCumulativeStudiesStudyUuidPatientsPatientUuidDaysDaysCalculationsAiCureOptions();
    
    /**
     * 
     * 
     * @param patientUuid 
     * @param days 
     * @param studyUuid 
     * @param when 
     * @return PatientXDayCumulativeAdherenceDto
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/adherence/x-day-cumulative/studies/{study_uuid}/patients/{patient_uuid}/days/{days}/calculations/overall", method = "GET")
    PatientXDayCumulativeAdherenceDto dashboardServiceV1AdherenceXDayCumulativeStudiesStudyUuidPatientsPatientUuidDaysDaysCalculationsOverallGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "patient_uuid", location = "path")
            String patientUuid,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "days", location = "path")
            String days,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "study_uuid", location = "path")
            String studyUuid,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "when", location = "query")
            String when);
    
    /**
     * 
     * 
     * @return void
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/adherence/x-day-cumulative/studies/{study_uuid}/patients/{patient_uuid}/days/{days}/calculations/overall", method = "OPTIONS")
    void dashboardServiceV1AdherenceXDayCumulativeStudiesStudyUuidPatientsPatientUuidDaysDaysCalculationsOverallOptions();
    
    /**
     * 
     * 
     * @param patientUuid 
     * @param days 
     * @param studyUuid 
     * @param dayOfWeek 
     * @param when 
     * @return PatientXDayWeekdayAdherenceDto
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/adherence/x-day-weekday/studies/{study_uuid}/patients/{patient_uuid}/day-of-week/{day_of_week}/days/{days}/calculations/ai-cure", method = "GET")
    PatientXDayWeekdayAdherenceDto dashboardServiceV1AdherenceXDayWeekdayStudiesStudyUuidPatientsPatientUuidDayOfWeekDayOfWeekDaysDaysCalculationsAiCureGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "patient_uuid", location = "path")
            String patientUuid,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "days", location = "path")
            String days,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "study_uuid", location = "path")
            String studyUuid,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "day_of_week", location = "path")
            String dayOfWeek,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "when", location = "query")
            String when);
    
    /**
     * 
     * 
     * @return void
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/adherence/x-day-weekday/studies/{study_uuid}/patients/{patient_uuid}/day-of-week/{day_of_week}/days/{days}/calculations/ai-cure", method = "OPTIONS")
    void dashboardServiceV1AdherenceXDayWeekdayStudiesStudyUuidPatientsPatientUuidDayOfWeekDayOfWeekDaysDaysCalculationsAiCureOptions();
    
    /**
     * 
     * 
     * @param patientUuid 
     * @param days 
     * @param studyUuid 
     * @param dayOfWeek 
     * @param when 
     * @return PatientXDayWeekdayAdherenceDto
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/adherence/x-day-weekday/studies/{study_uuid}/patients/{patient_uuid}/day-of-week/{day_of_week}/days/{days}/calculations/overall", method = "GET")
    PatientXDayWeekdayAdherenceDto dashboardServiceV1AdherenceXDayWeekdayStudiesStudyUuidPatientsPatientUuidDayOfWeekDayOfWeekDaysDaysCalculationsOverallGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "patient_uuid", location = "path")
            String patientUuid,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "days", location = "path")
            String days,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "study_uuid", location = "path")
            String studyUuid,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "day_of_week", location = "path")
            String dayOfWeek,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "when", location = "query")
            String when);
    
    /**
     * 
     * 
     * @return void
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/adherence/x-day-weekday/studies/{study_uuid}/patients/{patient_uuid}/day-of-week/{day_of_week}/days/{days}/calculations/overall", method = "OPTIONS")
    void dashboardServiceV1AdherenceXDayWeekdayStudiesStudyUuidPatientsPatientUuidDayOfWeekDayOfWeekDaysDaysCalculationsOverallOptions();
    
    /**
     * 
     * 
     * @param studyUuid 
     * @return StudyInterventionDto
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/interventions/ai-cure/studies/{study_uuid}", method = "GET")
    StudyInterventionDto dashboardServiceV1InterventionsAiCureStudiesStudyUuidGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "study_uuid", location = "path")
            String studyUuid);
    
    /**
     * 
     * 
     * @return void
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/interventions/ai-cure/studies/{study_uuid}", method = "OPTIONS")
    void dashboardServiceV1InterventionsAiCureStudiesStudyUuidOptions();
    
    /**
     * 
     * 
     * @param countryCode 
     * @param studyUuid 
     * @return CountryInterventionDto
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/interventions/ai-cure/studies/{study_uuid}/countries/{country_code}", method = "GET")
    CountryInterventionDto dashboardServiceV1InterventionsAiCureStudiesStudyUuidCountriesCountryCodeGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "country_code", location = "path")
            String countryCode,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "study_uuid", location = "path")
            String studyUuid);
    
    /**
     * 
     * 
     * @return void
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/interventions/ai-cure/studies/{study_uuid}/countries/{country_code}", method = "OPTIONS")
    void dashboardServiceV1InterventionsAiCureStudiesStudyUuidCountriesCountryCodeOptions();
    
    /**
     * 
     * 
     * @param studyUuid 
     * @param siteUuid 
     * @return SiteInterventionDto
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/interventions/ai-cure/studies/{study_uuid}/sites/{site_uuid}", method = "GET")
    SiteInterventionDto dashboardServiceV1InterventionsAiCureStudiesStudyUuidSitesSiteUuidGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "study_uuid", location = "path")
            String studyUuid,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "site_uuid", location = "path")
            String siteUuid);
    
    /**
     * 
     * 
     * @return void
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/interventions/ai-cure/studies/{study_uuid}/sites/{site_uuid}", method = "OPTIONS")
    void dashboardServiceV1InterventionsAiCureStudiesStudyUuidSitesSiteUuidOptions();
    
    /**
     * 
     * 
     * @param studyUuid 
     * @return StudyInterventionDto
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/interventions/call/studies/{study_uuid}", method = "GET")
    StudyInterventionDto dashboardServiceV1InterventionsCallStudiesStudyUuidGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "study_uuid", location = "path")
            String studyUuid);
    
    /**
     * 
     * 
     * @return void
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/interventions/call/studies/{study_uuid}", method = "OPTIONS")
    void dashboardServiceV1InterventionsCallStudiesStudyUuidOptions();
    
    /**
     * 
     * 
     * @param countryCode 
     * @param studyUuid 
     * @return CountryInterventionDto
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/interventions/call/studies/{study_uuid}/countries/{country_code}", method = "GET")
    CountryInterventionDto dashboardServiceV1InterventionsCallStudiesStudyUuidCountriesCountryCodeGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "country_code", location = "path")
            String countryCode,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "study_uuid", location = "path")
            String studyUuid);
    
    /**
     * 
     * 
     * @return void
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/interventions/call/studies/{study_uuid}/countries/{country_code}", method = "OPTIONS")
    void dashboardServiceV1InterventionsCallStudiesStudyUuidCountriesCountryCodeOptions();
    
    /**
     * 
     * 
     * @param studyUuid 
     * @param patientUuid 
     * @return PatientInterventionDto
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/interventions/call/studies/{study_uuid}/patients/{patient_uuid}", method = "GET")
    PatientInterventionDto dashboardServiceV1InterventionsCallStudiesStudyUuidPatientsPatientUuidGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "study_uuid", location = "path")
            String studyUuid,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "patient_uuid", location = "path")
            String patientUuid);
    
    /**
     * 
     * 
     * @return void
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/interventions/call/studies/{study_uuid}/patients/{patient_uuid}", method = "OPTIONS")
    void dashboardServiceV1InterventionsCallStudiesStudyUuidPatientsPatientUuidOptions();
    
    /**
     * 
     * 
     * @param studyUuid 
     * @param siteUuid 
     * @return SiteInterventionDto
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/interventions/call/studies/{study_uuid}/sites/{site_uuid}", method = "GET")
    SiteInterventionDto dashboardServiceV1InterventionsCallStudiesStudyUuidSitesSiteUuidGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "study_uuid", location = "path")
            String studyUuid,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "site_uuid", location = "path")
            String siteUuid);
    
    /**
     * 
     * 
     * @return void
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/interventions/call/studies/{study_uuid}/sites/{site_uuid}", method = "OPTIONS")
    void dashboardServiceV1InterventionsCallStudiesStudyUuidSitesSiteUuidOptions();
    
    /**
     * 
     * 
     * @param studyUuid 
     * @return StudyInterventionDto
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/interventions/email/studies/{study_uuid}", method = "GET")
    StudyInterventionDto dashboardServiceV1InterventionsEmailStudiesStudyUuidGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "study_uuid", location = "path")
            String studyUuid);
    
    /**
     * 
     * 
     * @return void
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/interventions/email/studies/{study_uuid}", method = "OPTIONS")
    void dashboardServiceV1InterventionsEmailStudiesStudyUuidOptions();
    
    /**
     * 
     * 
     * @param countryCode 
     * @param studyUuid 
     * @return CountryInterventionDto
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/interventions/email/studies/{study_uuid}/countries/{country_code}", method = "GET")
    CountryInterventionDto dashboardServiceV1InterventionsEmailStudiesStudyUuidCountriesCountryCodeGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "country_code", location = "path")
            String countryCode,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "study_uuid", location = "path")
            String studyUuid);
    
    /**
     * 
     * 
     * @return void
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/interventions/email/studies/{study_uuid}/countries/{country_code}", method = "OPTIONS")
    void dashboardServiceV1InterventionsEmailStudiesStudyUuidCountriesCountryCodeOptions();
    
    /**
     * 
     * 
     * @param studyUuid 
     * @param patientUuid 
     * @return PatientInterventionDto
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/interventions/email/studies/{study_uuid}/patients/{patient_uuid}", method = "GET")
    PatientInterventionDto dashboardServiceV1InterventionsEmailStudiesStudyUuidPatientsPatientUuidGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "study_uuid", location = "path")
            String studyUuid,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "patient_uuid", location = "path")
            String patientUuid);
    
    /**
     * 
     * 
     * @return void
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/interventions/email/studies/{study_uuid}/patients/{patient_uuid}", method = "OPTIONS")
    void dashboardServiceV1InterventionsEmailStudiesStudyUuidPatientsPatientUuidOptions();
    
    /**
     * 
     * 
     * @param studyUuid 
     * @param siteUuid 
     * @return SiteInterventionDto
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/interventions/email/studies/{study_uuid}/sites/{site_uuid}", method = "GET")
    SiteInterventionDto dashboardServiceV1InterventionsEmailStudiesStudyUuidSitesSiteUuidGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "study_uuid", location = "path")
            String studyUuid,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "site_uuid", location = "path")
            String siteUuid);
    
    /**
     * 
     * 
     * @return void
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/interventions/email/studies/{study_uuid}/sites/{site_uuid}", method = "OPTIONS")
    void dashboardServiceV1InterventionsEmailStudiesStudyUuidSitesSiteUuidOptions();
    
    /**
     * 
     * 
     * @param studyUuid 
     * @return StudyInterventionDto
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/interventions/in-person/studies/{study_uuid}", method = "GET")
    StudyInterventionDto dashboardServiceV1InterventionsInPersonStudiesStudyUuidGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "study_uuid", location = "path")
            String studyUuid);
    
    /**
     * 
     * 
     * @return void
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/interventions/in-person/studies/{study_uuid}", method = "OPTIONS")
    void dashboardServiceV1InterventionsInPersonStudiesStudyUuidOptions();
    
    /**
     * 
     * 
     * @param countryCode 
     * @param studyUuid 
     * @return CountryInterventionDto
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/interventions/in-person/studies/{study_uuid}/countries/{country_code}", method = "GET")
    CountryInterventionDto dashboardServiceV1InterventionsInPersonStudiesStudyUuidCountriesCountryCodeGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "country_code", location = "path")
            String countryCode,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "study_uuid", location = "path")
            String studyUuid);
    
    /**
     * 
     * 
     * @return void
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/interventions/in-person/studies/{study_uuid}/countries/{country_code}", method = "OPTIONS")
    void dashboardServiceV1InterventionsInPersonStudiesStudyUuidCountriesCountryCodeOptions();
    
    /**
     * 
     * 
     * @param studyUuid 
     * @param patientUuid 
     * @return PatientInterventionDto
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/interventions/in-person/studies/{study_uuid}/patients/{patient_uuid}", method = "GET")
    PatientInterventionDto dashboardServiceV1InterventionsInPersonStudiesStudyUuidPatientsPatientUuidGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "study_uuid", location = "path")
            String studyUuid,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "patient_uuid", location = "path")
            String patientUuid);
    
    /**
     * 
     * 
     * @return void
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/interventions/in-person/studies/{study_uuid}/patients/{patient_uuid}", method = "OPTIONS")
    void dashboardServiceV1InterventionsInPersonStudiesStudyUuidPatientsPatientUuidOptions();
    
    /**
     * 
     * 
     * @param studyUuid 
     * @param siteUuid 
     * @return SiteInterventionDto
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/interventions/in-person/studies/{study_uuid}/sites/{site_uuid}", method = "GET")
    SiteInterventionDto dashboardServiceV1InterventionsInPersonStudiesStudyUuidSitesSiteUuidGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "study_uuid", location = "path")
            String studyUuid,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "site_uuid", location = "path")
            String siteUuid);
    
    /**
     * 
     * 
     * @return void
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/interventions/in-person/studies/{study_uuid}/sites/{site_uuid}", method = "OPTIONS")
    void dashboardServiceV1InterventionsInPersonStudiesStudyUuidSitesSiteUuidOptions();
    
    /**
     * 
     * 
     * @param studyUuid 
     * @return StudyInterventionSummaryDto
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/interventions/summary/studies/{study_uuid}", method = "GET")
    StudyInterventionSummaryDto dashboardServiceV1InterventionsSummaryStudiesStudyUuidGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "study_uuid", location = "path")
            String studyUuid);
    
    /**
     * 
     * 
     * @return void
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/interventions/summary/studies/{study_uuid}", method = "OPTIONS")
    void dashboardServiceV1InterventionsSummaryStudiesStudyUuidOptions();
    
    /**
     * 
     * 
     * @param countryCode 
     * @param studyUuid 
     * @return CountryInterventionSummaryDto
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/interventions/summary/studies/{study_uuid}/countries/{country_code}", method = "GET")
    CountryInterventionSummaryDto dashboardServiceV1InterventionsSummaryStudiesStudyUuidCountriesCountryCodeGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "country_code", location = "path")
            String countryCode,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "study_uuid", location = "path")
            String studyUuid);
    
    /**
     * 
     * 
     * @return void
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/interventions/summary/studies/{study_uuid}/countries/{country_code}", method = "OPTIONS")
    void dashboardServiceV1InterventionsSummaryStudiesStudyUuidCountriesCountryCodeOptions();
    
    /**
     * 
     * 
     * @param studyUuid 
     * @param siteUuid 
     * @return SiteInterventionSummaryDto
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/interventions/summary/studies/{study_uuid}/sites/{site_uuid}", method = "GET")
    SiteInterventionSummaryDto dashboardServiceV1InterventionsSummaryStudiesStudyUuidSitesSiteUuidGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "study_uuid", location = "path")
            String studyUuid,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "site_uuid", location = "path")
            String siteUuid);
    
    /**
     * 
     * 
     * @return void
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/interventions/summary/studies/{study_uuid}/sites/{site_uuid}", method = "OPTIONS")
    void dashboardServiceV1InterventionsSummaryStudiesStudyUuidSitesSiteUuidOptions();
    
    /**
     * 
     * 
     * @param studyUuid 
     * @return StudyInterventionDto
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/interventions/text/studies/{study_uuid}", method = "GET")
    StudyInterventionDto dashboardServiceV1InterventionsTextStudiesStudyUuidGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "study_uuid", location = "path")
            String studyUuid);
    
    /**
     * 
     * 
     * @return void
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/interventions/text/studies/{study_uuid}", method = "OPTIONS")
    void dashboardServiceV1InterventionsTextStudiesStudyUuidOptions();
    
    /**
     * 
     * 
     * @param countryCode 
     * @param studyUuid 
     * @return CountryInterventionDto
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/interventions/text/studies/{study_uuid}/countries/{country_code}", method = "GET")
    CountryInterventionDto dashboardServiceV1InterventionsTextStudiesStudyUuidCountriesCountryCodeGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "country_code", location = "path")
            String countryCode,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "study_uuid", location = "path")
            String studyUuid);
    
    /**
     * 
     * 
     * @return void
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/interventions/text/studies/{study_uuid}/countries/{country_code}", method = "OPTIONS")
    void dashboardServiceV1InterventionsTextStudiesStudyUuidCountriesCountryCodeOptions();
    
    /**
     * 
     * 
     * @param studyUuid 
     * @param patientUuid 
     * @return PatientInterventionDto
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/interventions/text/studies/{study_uuid}/patients/{patient_uuid}", method = "GET")
    PatientInterventionDto dashboardServiceV1InterventionsTextStudiesStudyUuidPatientsPatientUuidGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "study_uuid", location = "path")
            String studyUuid,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "patient_uuid", location = "path")
            String patientUuid);
    
    /**
     * 
     * 
     * @return void
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/interventions/text/studies/{study_uuid}/patients/{patient_uuid}", method = "OPTIONS")
    void dashboardServiceV1InterventionsTextStudiesStudyUuidPatientsPatientUuidOptions();
    
    /**
     * 
     * 
     * @param studyUuid 
     * @param siteUuid 
     * @return SiteInterventionDto
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/interventions/text/studies/{study_uuid}/sites/{site_uuid}", method = "GET")
    SiteInterventionDto dashboardServiceV1InterventionsTextStudiesStudyUuidSitesSiteUuidGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "study_uuid", location = "path")
            String studyUuid,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "site_uuid", location = "path")
            String siteUuid);
    
    /**
     * 
     * 
     * @return void
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/interventions/text/studies/{study_uuid}/sites/{site_uuid}", method = "OPTIONS")
    void dashboardServiceV1InterventionsTextStudiesStudyUuidSitesSiteUuidOptions();
    
    /**
     * 
     * 
     * @param studyUuid 
     * @return StudyInterventionDto
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/interventions/total/studies/{study_uuid}", method = "GET")
    StudyInterventionDto dashboardServiceV1InterventionsTotalStudiesStudyUuidGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "study_uuid", location = "path")
            String studyUuid);
    
    /**
     * 
     * 
     * @return void
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/interventions/total/studies/{study_uuid}", method = "OPTIONS")
    void dashboardServiceV1InterventionsTotalStudiesStudyUuidOptions();
    
    /**
     * 
     * 
     * @param countryCode 
     * @param studyUuid 
     * @return CountryInterventionDto
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/interventions/total/studies/{study_uuid}/countries/{country_code}", method = "GET")
    CountryInterventionDto dashboardServiceV1InterventionsTotalStudiesStudyUuidCountriesCountryCodeGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "country_code", location = "path")
            String countryCode,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "study_uuid", location = "path")
            String studyUuid);
    
    /**
     * 
     * 
     * @return void
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/interventions/total/studies/{study_uuid}/countries/{country_code}", method = "OPTIONS")
    void dashboardServiceV1InterventionsTotalStudiesStudyUuidCountriesCountryCodeOptions();
    
    /**
     * 
     * 
     * @param studyUuid 
     * @param patientUuid 
     * @return PatientInterventionDto
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/interventions/total/studies/{study_uuid}/patients/{patient_uuid}", method = "GET")
    PatientInterventionDto dashboardServiceV1InterventionsTotalStudiesStudyUuidPatientsPatientUuidGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "study_uuid", location = "path")
            String studyUuid,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "patient_uuid", location = "path")
            String patientUuid);
    
    /**
     * 
     * 
     * @return void
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/interventions/total/studies/{study_uuid}/patients/{patient_uuid}", method = "OPTIONS")
    void dashboardServiceV1InterventionsTotalStudiesStudyUuidPatientsPatientUuidOptions();
    
    /**
     * 
     * 
     * @param studyUuid 
     * @param siteUuid 
     * @return SiteInterventionDto
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/interventions/total/studies/{study_uuid}/sites/{site_uuid}", method = "GET")
    SiteInterventionDto dashboardServiceV1InterventionsTotalStudiesStudyUuidSitesSiteUuidGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "study_uuid", location = "path")
            String studyUuid,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "site_uuid", location = "path")
            String siteUuid);
    
    /**
     * 
     * 
     * @return void
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/interventions/total/studies/{study_uuid}/sites/{site_uuid}", method = "OPTIONS")
    void dashboardServiceV1InterventionsTotalStudiesStudyUuidSitesSiteUuidOptions();
    
    /**
     * 
     * 
     * @return ListOfStrings
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/listing/countries", method = "GET")
    ListOfStrings dashboardServiceV1ListingCountriesGet();
    
    /**
     * 
     * 
     * @return void
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/listing/countries", method = "OPTIONS")
    void dashboardServiceV1ListingCountriesOptions();
    
    /**
     * 
     * 
     * @param countryCode 
     * @return ListOfStrings
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/listing/countries/{country_code}/patients", method = "GET")
    ListOfStrings dashboardServiceV1ListingCountriesCountryCodePatientsGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "country_code", location = "path")
            String countryCode);
    
    /**
     * 
     * 
     * @return void
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/listing/countries/{country_code}/patients", method = "OPTIONS")
    void dashboardServiceV1ListingCountriesCountryCodePatientsOptions();
    
    /**
     * 
     * 
     * @param countryCode 
     * @return ListOfStrings
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/listing/countries/{country_code}/sites", method = "GET")
    ListOfStrings dashboardServiceV1ListingCountriesCountryCodeSitesGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "country_code", location = "path")
            String countryCode);
    
    /**
     * 
     * 
     * @return void
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/listing/countries/{country_code}/sites", method = "OPTIONS")
    void dashboardServiceV1ListingCountriesCountryCodeSitesOptions();
    
    /**
     * 
     * 
     * @return ListOfStrings
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/listing/sites", method = "GET")
    ListOfStrings dashboardServiceV1ListingSitesGet();
    
    /**
     * 
     * 
     * @return void
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/listing/sites", method = "OPTIONS")
    void dashboardServiceV1ListingSitesOptions();
    
    /**
     * 
     * 
     * @param siteUuid 
     * @return ListOfStrings
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/listing/sites/{site_uuid}/patients", method = "GET")
    ListOfStrings dashboardServiceV1ListingSitesSiteUuidPatientsGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "site_uuid", location = "path")
            String siteUuid);
    
    /**
     * 
     * 
     * @return void
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/listing/sites/{site_uuid}/patients", method = "OPTIONS")
    void dashboardServiceV1ListingSitesSiteUuidPatientsOptions();
    
    /**
     * 
     * 
     * @return ListOfStrings
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/listing/studies", method = "GET")
    ListOfStrings dashboardServiceV1ListingStudiesGet();
    
    /**
     * 
     * 
     * @return void
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/listing/studies", method = "OPTIONS")
    void dashboardServiceV1ListingStudiesOptions();
    
    /**
     * 
     * 
     * @param studyUuid 
     * @return ListOfStrings
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/listing/studies/{study_uuid}/countries", method = "GET")
    ListOfStrings dashboardServiceV1ListingStudiesStudyUuidCountriesGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "study_uuid", location = "path")
            String studyUuid);
    
    /**
     * 
     * 
     * @return void
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/listing/studies/{study_uuid}/countries", method = "OPTIONS")
    void dashboardServiceV1ListingStudiesStudyUuidCountriesOptions();
    
    /**
     * 
     * 
     * @param studyUuid 
     * @return ListOfStrings
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/listing/studies/{study_uuid}/patients", method = "GET")
    ListOfStrings dashboardServiceV1ListingStudiesStudyUuidPatientsGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "study_uuid", location = "path")
            String studyUuid);
    
    /**
     * 
     * 
     * @return void
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/listing/studies/{study_uuid}/patients", method = "OPTIONS")
    void dashboardServiceV1ListingStudiesStudyUuidPatientsOptions();
    
    /**
     * 
     * 
     * @param studyUuid 
     * @return ListOfStrings
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/listing/studies/{study_uuid}/sites", method = "GET")
    ListOfStrings dashboardServiceV1ListingStudiesStudyUuidSitesGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "study_uuid", location = "path")
            String studyUuid);
    
    /**
     * 
     * 
     * @return void
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/listing/studies/{study_uuid}/sites", method = "OPTIONS")
    void dashboardServiceV1ListingStudiesStudyUuidSitesOptions();
    
    /**
     * 
     * 
     * @param studyUuid 
     * @param patientUuid 
     * @param when 
     * @return ArrayOfActivityDto
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/patient/statistics/activity/studies/{study_uuid}/patients/{patient_uuid}/last-30-days", method = "GET")
    ArrayOfActivityDto dashboardServiceV1PatientStatisticsActivityStudiesStudyUuidPatientsPatientUuidLast30DaysGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "study_uuid", location = "path")
            String studyUuid,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "patient_uuid", location = "path")
            String patientUuid,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "when", location = "query")
            String when);
    
    /**
     * 
     * 
     * @return void
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/patient/statistics/activity/studies/{study_uuid}/patients/{patient_uuid}/last-30-days", method = "OPTIONS")
    void dashboardServiceV1PatientStatisticsActivityStudiesStudyUuidPatientsPatientUuidLast30DaysOptions();
    
    /**
     * 
     * 
     * @param studyUuid 
     * @param patientUuid 
     * @param when 
     * @return ArrayOfActivityDto
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/patient/statistics/activity/studies/{study_uuid}/patients/{patient_uuid}/to-date", method = "GET")
    ArrayOfActivityDto dashboardServiceV1PatientStatisticsActivityStudiesStudyUuidPatientsPatientUuidToDateGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "study_uuid", location = "path")
            String studyUuid,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "patient_uuid", location = "path")
            String patientUuid,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "when", location = "query")
            String when);
    
    /**
     * 
     * 
     * @return void
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/patient/statistics/activity/studies/{study_uuid}/patients/{patient_uuid}/to-date", method = "OPTIONS")
    void dashboardServiceV1PatientStatisticsActivityStudiesStudyUuidPatientsPatientUuidToDateOptions();
    
    /**
     * 
     * 
     * @param studyUuid 
     * @param patientUuid 
     * @param when 
     * @return ProtectionLevelAveragesDto
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/patient/statistics/average-protection-level/studies/{study_uuid}/patients/{patient_uuid}/last-30-days", method = "GET")
    ProtectionLevelAveragesDto dashboardServiceV1PatientStatisticsAverageProtectionLevelStudiesStudyUuidPatientsPatientUuidLast30DaysGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "study_uuid", location = "path")
            String studyUuid,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "patient_uuid", location = "path")
            String patientUuid,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "when", location = "query")
            String when);
    
    /**
     * 
     * 
     * @return void
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/patient/statistics/average-protection-level/studies/{study_uuid}/patients/{patient_uuid}/last-30-days", method = "OPTIONS")
    void dashboardServiceV1PatientStatisticsAverageProtectionLevelStudiesStudyUuidPatientsPatientUuidLast30DaysOptions();
    
    /**
     * 
     * 
     * @param studyUuid 
     * @param patientUuid 
     * @param when 
     * @return ProtectionLevelAveragesDto
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/patient/statistics/average-protection-level/studies/{study_uuid}/patients/{patient_uuid}/to-date", method = "GET")
    ProtectionLevelAveragesDto dashboardServiceV1PatientStatisticsAverageProtectionLevelStudiesStudyUuidPatientsPatientUuidToDateGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "study_uuid", location = "path")
            String studyUuid,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "patient_uuid", location = "path")
            String patientUuid,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "when", location = "query")
            String when);
    
    /**
     * 
     * 
     * @return void
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/patient/statistics/average-protection-level/studies/{study_uuid}/patients/{patient_uuid}/to-date", method = "OPTIONS")
    void dashboardServiceV1PatientStatisticsAverageProtectionLevelStudiesStudyUuidPatientsPatientUuidToDateOptions();
    
    /**
     * 
     * 
     * @param studyUuid 
     * @param patientUuid 
     * @param when 
     * @return EncountersByProtectionLevelDto
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/patient/statistics/encounters-by-protection-level/studies/{study_uuid}/patients/{patient_uuid}/last-30-days", method = "GET")
    EncountersByProtectionLevelDto dashboardServiceV1PatientStatisticsEncountersByProtectionLevelStudiesStudyUuidPatientsPatientUuidLast30DaysGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "study_uuid", location = "path")
            String studyUuid,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "patient_uuid", location = "path")
            String patientUuid,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "when", location = "query")
            String when);
    
    /**
     * 
     * 
     * @return void
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/patient/statistics/encounters-by-protection-level/studies/{study_uuid}/patients/{patient_uuid}/last-30-days", method = "OPTIONS")
    void dashboardServiceV1PatientStatisticsEncountersByProtectionLevelStudiesStudyUuidPatientsPatientUuidLast30DaysOptions();
    
    /**
     * 
     * 
     * @param studyUuid 
     * @param patientUuid 
     * @param when 
     * @return EncountersByProtectionLevelDto
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/patient/statistics/encounters-by-protection-level/studies/{study_uuid}/patients/{patient_uuid}/to-date", method = "GET")
    EncountersByProtectionLevelDto dashboardServiceV1PatientStatisticsEncountersByProtectionLevelStudiesStudyUuidPatientsPatientUuidToDateGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "study_uuid", location = "path")
            String studyUuid,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "patient_uuid", location = "path")
            String patientUuid,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "when", location = "query")
            String when);
    
    /**
     * 
     * 
     * @return void
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/patient/statistics/encounters-by-protection-level/studies/{study_uuid}/patients/{patient_uuid}/to-date", method = "OPTIONS")
    void dashboardServiceV1PatientStatisticsEncountersByProtectionLevelStudiesStudyUuidPatientsPatientUuidToDateOptions();
    
    /**
     * 
     * 
     * @param studyUuid 
     * @param patientUuid 
     * @param when 
     * @return PartnerStatusDto
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/patient/statistics/partner-status/studies/{study_uuid}/patients/{patient_uuid}/last-30-days", method = "GET")
    PartnerStatusDto dashboardServiceV1PatientStatisticsPartnerStatusStudiesStudyUuidPatientsPatientUuidLast30DaysGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "study_uuid", location = "path")
            String studyUuid,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "patient_uuid", location = "path")
            String patientUuid,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "when", location = "query")
            String when);
    
    /**
     * 
     * 
     * @return void
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/patient/statistics/partner-status/studies/{study_uuid}/patients/{patient_uuid}/last-30-days", method = "OPTIONS")
    void dashboardServiceV1PatientStatisticsPartnerStatusStudiesStudyUuidPatientsPatientUuidLast30DaysOptions();
    
    /**
     * 
     * 
     * @param studyUuid 
     * @param patientUuid 
     * @param when 
     * @return PartnerStatusDto
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/patient/statistics/partner-status/studies/{study_uuid}/patients/{patient_uuid}/to-date", method = "GET")
    PartnerStatusDto dashboardServiceV1PatientStatisticsPartnerStatusStudiesStudyUuidPatientsPatientUuidToDateGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "study_uuid", location = "path")
            String studyUuid,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "patient_uuid", location = "path")
            String patientUuid,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "when", location = "query")
            String when);
    
    /**
     * 
     * 
     * @return void
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/patient/statistics/partner-status/studies/{study_uuid}/patients/{patient_uuid}/to-date", method = "OPTIONS")
    void dashboardServiceV1PatientStatisticsPartnerStatusStudiesStudyUuidPatientsPatientUuidToDateOptions();
    
    /**
     * 
     * 
     * @param studyUuid 
     * @param patientUuid 
     * @param when 
     * @return ArrayOfPillPercentageInHourOfDayDto
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/patient/statistics/pill-time/studies/{study_uuid}/patients/{patient_uuid}/last-30-days", method = "GET")
    ArrayOfPillPercentageInHourOfDayDto dashboardServiceV1PatientStatisticsPillTimeStudiesStudyUuidPatientsPatientUuidLast30DaysGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "study_uuid", location = "path")
            String studyUuid,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "patient_uuid", location = "path")
            String patientUuid,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "when", location = "query")
            String when);
    
    /**
     * 
     * 
     * @return void
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/patient/statistics/pill-time/studies/{study_uuid}/patients/{patient_uuid}/last-30-days", method = "OPTIONS")
    void dashboardServiceV1PatientStatisticsPillTimeStudiesStudyUuidPatientsPatientUuidLast30DaysOptions();
    
    /**
     * 
     * 
     * @param studyUuid 
     * @param patientUuid 
     * @param when 
     * @return ArrayOfPillPercentageInHourOfDayDto
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/patient/statistics/pill-time/studies/{study_uuid}/patients/{patient_uuid}/to-date", method = "GET")
    ArrayOfPillPercentageInHourOfDayDto dashboardServiceV1PatientStatisticsPillTimeStudiesStudyUuidPatientsPatientUuidToDateGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "study_uuid", location = "path")
            String studyUuid,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "patient_uuid", location = "path")
            String patientUuid,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "when", location = "query")
            String when);
    
    /**
     * 
     * 
     * @return void
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/v1/patient/statistics/pill-time/studies/{study_uuid}/patients/{patient_uuid}/to-date", method = "OPTIONS")
    void dashboardServiceV1PatientStatisticsPillTimeStudiesStudyUuidPatientsPatientUuidToDateOptions();
    
    /**
     * 
     * 
     * @return VersionDto
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/version", method = "GET")
    VersionDto dashboardServiceVersionGet();
    
    /**
     * 
     * 
     * @return void
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/dashboard-service/version", method = "OPTIONS")
    void dashboardServiceVersionOptions();
    
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
    
}

