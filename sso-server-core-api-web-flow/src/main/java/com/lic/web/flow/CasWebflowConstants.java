package com.lic.web.flow;

/**
 * TODO
 *
 * @author licong
 * @version 1.0
 * @date 2020/11/13 15:22
 */
public interface CasWebflowConstants {

    String TRANSITION_ID_AUTHENTICATION_FAILURE = "authenticationFailure";

    String TRANSITION_ID_YES = "yes";

    String TRANSITION_ID_WARN = "warn";

    String TRANSITION_ID_NO = "no";

    String TRANSITION_ID_SUBMIT = "submit";

    String TRANSITION_ID_ERROR = "error";

    String TRANSITION_ID_RESUME = "resume";

    String TRANSITION_ID_GATEWAY = "gateway";

    String TRANSITION_ID_STOP = "stop";

    String TRANSITION_ID_TGT_NOT_EXISTS = "notExists";

    String TRANSITION_ID_TGT_INVALID = "invalid";

    String TRANSITION_ID_TGT_VALID = "valid";

    String TRANSITION_ID_INTERRUPT_SKIPPED = "interruptSkipped";

    String TRANSITION_ID_INTERRUPT_REQUIRED = "interruptRequired";

    String TRANSITION_ID_UNAVAILABLE = "unavailable";

    String TRANSITION_ID_BYPASS = "bypass";

    String TRANSITION_ID_DENY = "deny";

    String TRANSITION_ID_SUCCESS = "success";

    String TRANSITION_ID_REDIRECT = "redirect";

    String TRANSITION_ID_PROPAGATE = "propagate";

    String TRANSITION_ID_FINISH = "finish";

    String TRANSITION_ID_FRONT = "front";

    String TRANSITION_ID_PROCEED = "proceed";

    String TRANSITION_ID_CONFIRM = "confirm";

    String TRANSITION_ID_CANCEL = "cancel";

    String TRANSITION_ID_ENROLL = "enroll";

    String TRANSITION_ID_SUCCESS_WITH_WARNINGS = "successWithWarnings";

    String TRANSITION_ID_RESET_PASSWORD = "resetPassword";

    String TRANSITION_ID_FORGOT_USERNAME = "forgotUsername";

    String TRANSITION_ID_AUP_MUST_ACCEPT = "mustAcceptUsagePolicy";

    String TRANSITION_ID_AUP_ACCEPTED = "acceptedUsagePolicy";

    String TRANSITION_ID_MFA_FAILURE = "mfaFailure";

    String STATE_ID_SUCCESS = "success";

    String STATE_ID_STOP_WEBFLOW = "stopWebflow";

    String STATE_ID_VERIFY_TRUSTED_DEVICE = "verifyTrustedDevice";

    String STATE_ID_REGISTER_TRUSTED_DEVICE = "registerTrustedDevice";

    String STATE_ID_REAL_SUBMIT = "realSubmit";

    String STATE_ID_GATEWAY = "gateway";

    String STATE_ID_FINISH_MFA_TRUSTED_AUTH = "finishMfaTrustedAuth";

    String STATE_ID_INITIAL_AUTHN_REQUEST_VALIDATION_CHECK = "initialAuthenticationRequestValidationCheck";

    String STATE_ID_SEND_TICKET_GRANTING_TICKET = "sendTicketGrantingTicket";

    String STATE_ID_TICKET_GRANTING_TICKET_CHECK = "ticketGrantingTicketCheck";

    String STATE_ID_CREATE_TICKET_GRANTING_TICKET = "createTicketGrantingTicket";

    String STATE_ID_INIT_LOGIN_FORM = "initializeLoginForm";

    String STATE_ID_VIEW_LOGIN_FORM = "viewLoginForm";

    String STATE_ID_SERVICE_AUTHZ_CHECK = "serviceAuthorizationCheck";

    String STATE_ID_TERMINATE_SESSION = "terminateSession";

    String STATE_ID_GATEWAY_REQUEST_CHECK = "gatewayRequestCheck";

    String STATE_ID_GENERATE_SERVICE_TICKET = "generateServiceTicket";

    String STATE_ID_GATEWAY_SERVICES_MGMT_CHECK = "gatewayServicesManagementCheck";

    String STATE_ID_POST_VIEW = "postView";

    String STATE_ID_HEADER_VIEW = "headerView";

    String STATE_ID_SHOW_WARNING_VIEW = "showWarningView";

    String STATE_ID_REDIRECT_VIEW = "redirectView";

    String STATE_ID_END_WEBFLOW = "endWebflowExecution";

    String STATE_ID_VIEW_REDIR_UNAUTHZ_URL = "viewRedirectToUnauthorizedUrlView";

    String STATE_ID_SERVICE_UNAUTHZ_CHECK = "serviceUnauthorizedCheck";

    String STATE_ID_VIEW_GENERIC_LOGIN_SUCCESS = "viewGenericLoginSuccess";

    String STATE_ID_SERVICE_CHECK = "serviceCheck";

    String STATE_ID_VIEW_SERVICE_ERROR = "viewServiceErrorView";

    String STATE_ID_WARN = "warn";

    String STATE_ID_RENEW_REQUEST_CHECK = "renewRequestCheck";

    String STATE_ID_HAS_SERVICE_CHECK = "hasServiceCheck";

    String STATE_ID_REDIRECT = "redirect";

    String STATE_ID_MFA_UNAVAILABLE = "mfaUnavailable";

    String STATE_ID_MFA_DENIED = "mfaDenied";

    String STATE_ID_DO_LOGOUT = "doLogout";

    String STATE_ID_PROPAGATE_LOGOUT_REQUESTS = "propagateLogoutRequests";

    String STATE_ID_LOGOUT_VIEW = "logoutView";

    String STATE_ID_FINISH_LOGOUT = "finishLogout";

    String STATE_ID_FRONT_LOGOUT = "frontLogout";

    String STATE_ID_CONFIRM_LOGOUT_VIEW = "confirmLogoutView";

    String STATE_ID_PASSWORD_UPDATE_SUCCESS = "casPasswordUpdateSuccess";

    String STATE_ID_HANDLE_AUTHN_FAILURE = "handleAuthenticationFailure";

    String STATE_ID_PASSWORD_RESET_SUBFLOW = "pswdResetSubflow";

    String STATE_ID_PROCEED_FROM_AUTHENTICATION_WARNINGS_VIEW = "proceedFromAuthenticationWarningView";

    String STATE_ID_PASSWORD_RESET_FLOW_COMPLETE = "pswdResetComplete";

    String STATE_ID_REDIRECT_TO_LOGIN = "redirectToLogin";

    String STATE_ID_POST_LOGIN_PASSWORD_CHANGE_CHECK = "postLoginPswdChangeCheck";

    String STATE_ID_CHECK_DO_CHANGE_PASSWORD = "checkDoChangePassword";

    String STATE_ID_DELEGATED_AUTHENTICATION = "delegatedAuthenticationAction";

    String STATE_ID_MFA_CHECK_AVAILABLE = "mfaCheckAvailable";

    String STATE_ID_MFA_CHECK_BYPASS = "mfaCheckBypass";

    String STATE_ID_MFA_PRE_AUTH = "mfaPreAuth";

    String VIEW_ID_REGISTER_DEVICE = "registerDeviceView";

    String VIEW_ID_PAC4J_STOP_WEBFLOW = "casPac4jStopWebflow";

    String VIEW_ID_WSFED_STOP_WEBFLOW = "casWsFedStopWebflow";

    String VIEW_ID_ERROR = "error";

    String VIEW_ID_SHOW_AUTHN_WARNING_MSGS = "showAuthenticationWarningMessages";

    String VIEW_ID_MFA_UNAVAILABLE = "casMfaUnavailableView";

    String VIEW_ID_MFA_DENIED = "casMfaDeniedView";

    String VIEW_ID_POST_RESPONSE = "casPostResponseView";

    String VIEW_ID_GENERIC_SUCCESS = "casGenericSuccessView";

    String VIEW_ID_CONFIRM = "casConfirmView";

    String VIEW_ID_SERVICE_ERROR = "casServiceErrorView";

    String VIEW_ID_SEND_RESET_PASSWORD_ACCT_INFO = "casResetPasswordSendInstructionsView";

    String VIEW_ID_SENT_FORGOT_USERNAME_ACCT_INFO = "casForgotUsernameSentInfoView";

    String VIEW_ID_FORGOT_USERNAME_ACCT_INFO = "casForgotUsernameSendInfoView";

    String VIEW_ID_INVALID_AUTHENTICATION_HOURS = "casBadHoursView";

    String VIEW_ID_PASSWORD_UPDATE_SUCCESS = "casPasswordUpdateSuccessView";

    String VIEW_ID_AUTHENTICATION_BLOCKED = "casAuthenticationBlockedView";

    String VIEW_ID_PASSWORD_RESET_ERROR = "casResetPasswordErrorView";

    String VIEW_ID_INVALID_WORKSTATION = "casBadWorkstationView";

    String VIEW_ID_ACCOUNT_DISABLED = "casAccountDisabledView";

    String VIEW_ID_ACCOUNT_LOCKED = "casAccountLockedView";

    String VIEW_ID_MUST_CHANGE_PASSWORD = "casMustChangePassView";

    String VIEW_ID_EXPIRED_PASSWORD = "casExpiredPassView";

    String VIEW_ID_SENT_RESET_PASSWORD_ACCT_INFO = "casResetPasswordSentInstructionsView";

    String VIEW_ID_ENDPOINT_ADMIN_LOGIN_VIEW = "casAdminLoginView";

    String DECISION_STATE_REQUIRE_REGISTRATION = "checkRegistrationRequired";

    String DECISION_STATE_FINISH_LOGOUT = "finishLogout";

    String DECISION_STATE_CHECK_FOR_PASSWORD_RESET_TOKEN_ACTION = "checkForPswdResetToken";


    String VAR_ID_CREDENTIAL = "credential";

    String VAR_ID_MFA_PROVIDER_ID = "mfaProviderId";


    String ATTRIBUTE_ID_AUTHENTICATION_WARNINGS = "authenticationWarnings";


    String ACTION_ID_INIT_FLOW_SETUP = "initialFlowSetupAction";

    String ACTION_ID_TICKET_GRANTING_TICKET_CHECK = "ticketGrantingTicketCheckAction";

    String ACTION_ID_INITIAL_AUTHN_REQUEST_VALIDATION = "initialAuthenticationRequestValidationAction";

    String ACTION_ID_REMOTE_TRUSTED_AUTHENTICATION = "remoteAuthenticate";

    String ACTION_ID_CLEAR_WEBFLOW_CREDENTIALS = "clearWebflowCredentialsAction";

    String ACTION_ID_GENERATE_SERVICE_TICKET = "generateServiceTicketAction";

    String ACTION_ID_REDIRECT_TO_SERVICE = "redirectToServiceAction";

    String ACTION_ID_TERMINATE_SESSION = "terminateSessionAction";

    String ACTION_ID_LOGOUT_VIEW_SETUP = "logoutViewSetupAction";

    String ACTION_ID_AUTHENTICATION_EXCEPTION_HANDLER = "authenticationExceptionHandler";

    String ACTION_ID_SEND_TICKET_GRANTING_TICKET = "sendTicketGrantingTicketAction";

    String ACTION_ID_CREATE_TICKET_GRANTING_TICKET = "createTicketGrantingTicketAction";

    String ACTION_ID_DELEGATED_AUTHENTICATION = "delegatedAuthenticationAction";
}
