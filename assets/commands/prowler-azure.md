# TLDR

**Run Azure security assessment**

```prowler azure```

**Run specific checks**

```prowler azure --checks [storage_account_public_access]```

**Run with compliance framework**

```prowler azure --compliance [cis_2.0_azure]```

**Specify subscription**

```prowler azure --subscription-ids [sub-id-1]```

# SYNOPSIS

**prowler azure** [_options_]

# PARAMETERS

**--checks** _checks_
> Specific checks to run.

**--services** _services_
> Services to check.

**--compliance** _framework_
> Compliance framework.

**--subscription-ids** _ids_
> Azure subscription IDs.

**-M**, **--output-modes** _format_
> Output format.

**-o**, **--output-directory** _dir_
> Output directory.

# DESCRIPTION

**prowler azure** performs security assessment of Azure subscriptions. Checks configuration against best practices and compliance frameworks. Identifies security issues in Azure resources.

# SEE ALSO

[prowler](/man/prowler)(1), [az](/man/az)(1)

