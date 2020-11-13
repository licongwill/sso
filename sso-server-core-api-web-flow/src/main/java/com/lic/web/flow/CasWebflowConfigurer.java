package com.lic.web.flow;

import org.springframework.binding.expression.Expression;
import org.springframework.core.Ordered;
import org.springframework.webflow.action.EvaluateAction;
import org.springframework.webflow.action.SetAction;
import org.springframework.webflow.engine.*;
import org.springframework.webflow.engine.builder.BinderConfiguration;
import org.springframework.webflow.execution.Action;
import org.springframework.webflow.execution.ViewFactory;

/**
 * TODO
 *
 * @author licong
 * @version 1.0
 * @date 2020/11/13 15:14
 */
public interface CasWebflowConfigurer  extends Ordered{

    String FLOW_ID_LOGIN = "login";

    String FLOW_ID_LOGOUT = "logout";

    void initialize();

    Flow getLoginFlow();

    Flow getLogoutFlow();

    TransitionableState getStartState(Flow flow);

    Transition createTransition(String criteriaOutcome,String targetState);

    Transition createTransition(String criteriaOutcome, TransitionableState targetState);

    Transition createTransition(Expression criteriaOutcomeExpression, String targetState);

    Transition createTransition(String targetState);

    SetAction createSetAction(String name, String value);

    EvaluateAction createEvaluateAction(String expression);

    ActionState createActionState(Flow flow, String name, Action... actions);

    DecisionState createDecisionState(Flow flow, String id, String testExpression,
                                      String thenStateId, String elseStateId);

    void setStartState(Flow flow, String state);

    void setStartState(Flow flow, TransitionableState state);

    EndState createEndState(Flow flow, String id);

    EndState createEndState(Flow flow, String id, String viewId, boolean redirect);

    EndState createEndState(Flow flow, String id, String viewId);

    EndState createEndState(Flow flow, String id, Expression expression);

    EndState createEndState(Flow flow, String id, ViewFactory viewFactory);

    ViewState createViewState(Flow flow, String id, Expression expression, BinderConfiguration binder);

    ViewState createViewState(Flow flow, String id, String viewId);

    ViewState createViewState(Flow flow, String id, String viewId, BinderConfiguration binder);

    SubflowState createSubflowState(Flow flow, String id, String subflow,
                                    Action entryAction);

    SubflowState createSubflowState(Flow flow, String id, String subflow);

    Flow buildFlow(String location, String id);

    default String getName() {
        return getClass().getSimpleName();
    }
}
