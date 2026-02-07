# TAGLINE

Manage multi-account AWS environments

# TLDR

**Describe the organization**

```aws organizations describe-organization```

**List all accounts** in the organization

```aws organizations list-accounts```

**List organizational units** under a parent

```aws organizations list-organizational-units-for-parent --parent-id [r-xxxx|ou-xxxx-xxxxxxxx]```

**Create a new account**

```aws organizations create-account --account-name "[Account Name]" --email [admin@example.com]```

**Move an account** to a different OU

```aws organizations move-account --account-id [123456789012] --source-parent-id [ou-source] --destination-parent-id [ou-dest]```

**List policies** of a specific type

```aws organizations list-policies --filter SERVICE_CONTROL_POLICY```

**Attach a policy** to an account or OU

```aws organizations attach-policy --policy-id [p-xxxxxxxx] --target-id [account-id|ou-id]```

**List accounts for a parent** OU

```aws organizations list-accounts-for-parent --parent-id [ou-xxxx-xxxxxxxx]```

# SYNOPSIS

**aws organizations** _subcommand_ [_options_]

# DESCRIPTION

**aws organizations** is a subcommand of the AWS CLI that manages AWS Organizations, a service for centrally managing multiple AWS accounts. It enables consolidated billing, account creation, and policy-based governance.

Organizations have a hierarchical structure: a root containing organizational units (OUs) and accounts. Service Control Policies (SCPs) set permission guardrails that apply to all principals in target accounts or OUs, restricting what actions can be performed.

The management account (formerly master) creates and controls the organization. Member accounts can be created within the organization or invited from existing accounts.

# PARAMETERS

**describe-organization**
> Get organization details and features.

**list-accounts**
> List all accounts in the organization.

**list-roots**
> List organization roots.

**list-organizational-units-for-parent**
> List OUs under a parent.

**list-accounts-for-parent**
> List accounts directly in an OU.

**create-account**
> Create a new member account.

**create-organizational-unit**
> Create a new OU.

**move-account**
> Move account between OUs.

**list-policies**
> List policies of a given type.

**create-policy**
> Create a new policy.

**attach-policy**
> Attach policy to a target.

**detach-policy**
> Remove policy from a target.

**describe-account**
> Get account details.

**--parent-id** _id_
> Root or OU identifier.

**--account-id** _id_
> 12-digit AWS account ID.

**--policy-id** _id_
> Policy identifier.

**--target-id** _id_
> Account, OU, or root to target.

**--filter** _type_
> Policy type filter: SERVICE_CONTROL_POLICY, TAG_POLICY, BACKUP_POLICY, AISERVICES_OPT_OUT_POLICY.

# CAVEATS

Organizations commands must run from the management account. SCPs do not grant permissions, only restrict them. The management account is not affected by SCPs. Account creation is asynchronous; check status with describe-create-account-status. Removing an account from an organization requires it to have payment method configured for standalone billing.

# HISTORY

**AWS Organizations** launched in **February 2017** to enable multi-account management. **Service Control Policies** provided centralized governance. **Consolidated Billing** merged from the older Consolidated Billing feature. Features expanded to include **Tag Policies**, **Backup Policies**, and **AI Services Opt-out Policies**. AWS Control Tower, launched in **2019**, builds on Organizations for landing zone automation.

# SEE ALSO

[aws](/man/aws)(1), [aws-iam](/man/aws-iam)(1), [aws-sts](/man/aws-sts)(1), [aws-sso](/man/aws-sso)(1)
