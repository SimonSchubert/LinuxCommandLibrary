# TAGLINE

Manage cost budgets and spending alerts.

# TLDR

**Create a monthly cost budget**

```aws budgets create-budget --account-id [123456789012] --budget file://[budget.json]```

**Create a budget with notifications**

```aws budgets create-budget --account-id [123456789012] --budget file://[budget.json] --notifications-with-subscribers file://[notifications.json]```

**List all budgets** for an account

```aws budgets describe-budgets --account-id [123456789012]```

**Get details** of a specific budget

```aws budgets describe-budget --account-id [123456789012] --budget-name "[MyBudget]"```

**Update a budget** limit

```aws budgets update-budget --account-id [123456789012] --new-budget file://[updated-budget.json]```

**Delete a budget**

```aws budgets delete-budget --account-id [123456789012] --budget-name "[MyBudget]"```

**Create a budget action** (auto-response)

```aws budgets create-budget-action --account-id [123456789012] --budget-name "[MyBudget]" --action-type APPLY_IAM_POLICY --action-threshold file://[threshold.json]```

# SYNOPSIS

**aws budgets** _command_ [_options_]

# PARAMETERS

**create-budget**
> Create a new budget with optional notifications

**describe-budgets**
> List all budgets for an account

**describe-budget**
> Get details of a specific budget

**update-budget**
> Modify an existing budget

**delete-budget**
> Remove a budget

**create-budget-action**
> Create automated actions when thresholds are exceeded

**describe-budget-actions-for-budget**
> List actions associated with a budget

**create-notification**
> Add a notification to an existing budget

**--account-id** _id_
> AWS account ID (12 digits)

**--budget** _json_
> Budget specification (inline JSON or file://path)

**--budget-name** _name_
> Name of the budget

**--notifications-with-subscribers** _json_
> Notification thresholds and subscriber emails/SNS topics

**--new-budget** _json_
> Updated budget specification

# BUDGET JSON STRUCTURE

```json
{
  "BudgetName": "Monthly-EC2-Budget",
  "BudgetLimit": {"Amount": "100", "Unit": "USD"},
  "TimeUnit": "MONTHLY",
  "BudgetType": "COST"
}
```

Budget types include **COST**, **USAGE**, **RI_UTILIZATION**, **RI_COVERAGE**, **SAVINGS_PLANS_UTILIZATION**, and **SAVINGS_PLANS_COVERAGE**.

# DESCRIPTION

**aws budgets** manages AWS Budgets for cost control and monitoring. Budgets track spending or usage against defined limits and send alerts when thresholds are approached or exceeded.

Create budgets to monitor overall account costs, specific services, linked accounts, or tagged resources. Notifications alert subscribers via email or SNS when spending reaches specified percentages of the budget limit.

**Budget actions** automate responses to budget alerts, such as applying restrictive IAM policies or stopping EC2 instances when thresholds are exceeded.

Time units include DAILY, MONTHLY, QUARTERLY, and ANNUALLY. If no start date is specified, budgets begin at the start of the chosen period.

# CAVEATS

Budgets have a processing delay of up to 24 hours for cost data. Budget limits are soft limits that trigger alerts but don't automatically stop spending. Free tier includes 2 budgets; additional budgets incur charges. Account ID must be specified explicitly in CLI commands.

# HISTORY

**AWS Budgets** launched in **January 2017** as part of AWS Cost Management tools. It evolved from the earlier Billing Alerts feature. Budget actions for automated responses were added in **2020**, enabling automatic cost control measures beyond just notifications.

# SEE ALSO

[aws](/man/aws)(1), [aws-ce](/man/aws-ce)(1), [aws-organizations](/man/aws-organizations)(1)
