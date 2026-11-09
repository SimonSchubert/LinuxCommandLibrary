# TAGLINE

sets or displays the IBM Cloud API endpoint

# TLDR

**Show current API endpoint**

```ibmcloud api```

**Set API endpoint**

```ibmcloud api [https://cloud.ibm.com]```

**Set private endpoint**

```ibmcloud api https://private.cloud.ibm.com```

**Set private endpoint via VPC**

```ibmcloud api https://private.cloud.ibm.com --vpc```

**Unset API endpoint**

```ibmcloud api --unset```

**Skip SSL validation**

```ibmcloud api [endpoint] --skip-ssl-validation```

# SYNOPSIS

**ibmcloud** **api** [_endpoint_] [_options_]

# PARAMETERS

_ENDPOINT_
> API endpoint to target, such as cloud.ibm.com. Displays the current endpoint when omitted.

**--unset**
> Remove the saved API endpoint setting.

**--skip-ssl-validation**
> Skip SSL validation of HTTP requests (not recommended).

**--vpc**
> Use a VPC connection to reach a private API endpoint.

# DESCRIPTION

**ibmcloud api** sets or displays the IBM Cloud API endpoint used by later CLI commands. If neither an endpoint nor **--unset** is specified, the current API endpoint is displayed. The default public endpoint is https://cloud.ibm.com. Use https://private.cloud.ibm.com for private network access.

# SEE ALSO

[ibmcloud](/man/ibmcloud)(1), [ibmcloud-login](/man/ibmcloud-login)(1)

# RESOURCES

```[Documentation](https://cloud.ibm.com/docs/cli?topic=cli-ibmcloud_cli)```

<!-- verified: 2026-11-09 -->
