# TLDR

**List all rules** in the default event bus

```aws events list-rules```

**Describe a specific rule**

```aws events describe-rule --name [rule_name]```

**List targets** for a rule

```aws events list-targets-by-rule --rule [rule_name]```

**Create a scheduled rule** that runs every hour

```aws events put-rule --name [rule_name] --schedule-expression "rate(1 hour)"```

**Create an event pattern rule** to match specific events

```aws events put-rule --name [rule_name] --event-pattern '{"source":["aws.ec2"],"detail-type":["EC2 Instance State-change Notification"]}'```

**Add a Lambda target** to a rule

```aws events put-targets --rule [rule_name] --targets Id=1,Arn=[arn:aws:lambda:region:account:function:name]```

**Disable a rule**

```aws events disable-rule --name [rule_name]```

**Delete a rule** (remove targets first)

```aws events delete-rule --name [rule_name]```

# SYNOPSIS

**aws events** _subcommand_ [_options_]

# DESCRIPTION

**aws events** is a subcommand of the AWS CLI that manages Amazon EventBridge (formerly CloudWatch Events), a serverless event bus service. It routes events between AWS services, SaaS applications, and your own applications.

Rules match incoming events based on patterns and route them to targets like Lambda functions, Step Functions, SNS topics, SQS queues, and more. Rules can also trigger on schedules using cron or rate expressions.

Event buses act as routers: the default bus receives AWS service events, while custom buses can receive events from your applications. Partner event sources connect to SaaS providers.

# PARAMETERS

**list-rules**
> List rules on an event bus.

**describe-rule**
> Get details about a specific rule.

**put-rule**
> Create or update a rule.

**delete-rule**
> Remove a rule.

**enable-rule**
> Activate a disabled rule.

**disable-rule**
> Deactivate a rule without deleting it.

**list-targets-by-rule**
> List targets attached to a rule.

**put-targets**
> Add targets to a rule.

**remove-targets**
> Remove targets from a rule.

**list-event-buses**
> List event buses in the account.

**put-events**
> Send custom events to an event bus.

**--name** _rule-name_
> Name of the rule.

**--schedule-expression** _expression_
> Cron or rate expression for scheduled rules.

**--event-pattern** _json_
> JSON pattern to match events.

**--targets** _targets_
> Target specifications (Id, Arn, Input, etc.).

**--event-bus-name** _name_
> Event bus name (default if not specified).

# CAVEATS

Must remove all targets before deleting a rule. Schedule expressions use UTC timezone. Event patterns match on exact values by default; use prefix or anything-but for flexibility. Maximum 5 targets per rule (can be increased via quota request). Rules can take up to one minute to become active.

# HISTORY

**CloudWatch Events** launched in **January 2016** as AWS's first event-driven integration service. It was rebranded as **Amazon EventBridge** at **AWS re:Invent 2019** with expanded capabilities including custom event buses and third-party SaaS integrations. Schema registry and discovery were added to help developers understand event structures. The service continues to be central to serverless and event-driven architectures on AWS.

# SEE ALSO

[aws](/man/aws)(1), [aws-lambda](/man/aws-lambda)(1), [aws-sns](/man/aws-sns)(1), [aws-sqs](/man/aws-sqs)(1)
