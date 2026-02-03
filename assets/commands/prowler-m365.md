# TLDR

**Run Microsoft 365 security assessment**

```prowler m365```

**Run specific checks**

```prowler m365 --checks [conditional_access_policies]```

**Run with compliance framework**

```prowler m365 --compliance [cis_2.0_m365]```

# SYNOPSIS

**prowler m365** [_options_]

# PARAMETERS

**--checks** _checks_
> Specific checks to run.

**--services** _services_
> Services to check.

**--compliance** _framework_
> Compliance framework.

**-M**, **--output-modes** _format_
> Output format.

**-o**, **--output-directory** _dir_
> Output directory.

# DESCRIPTION

**prowler m365** performs security assessment of Microsoft 365 tenants. Checks Entra ID, Exchange, SharePoint, and Teams configurations against security best practices.

# SEE ALSO

[prowler](/man/prowler)(1)

