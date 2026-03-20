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

**--unset**
> Clear the API endpoint.

**--skip-ssl-validation**
> Bypass SSL validation (not recommended).

**--vpc**
> Use VPC connection for private endpoint.

# DESCRIPTION

**ibmcloud api** sets or displays the IBM Cloud API endpoint. If neither an endpoint nor **--unset** is specified, the current API endpoint is displayed. The default public endpoint is https://cloud.ibm.com. Use https://private.cloud.ibm.com for private network access. Setting the API endpoint is required before logging in with **ibmcloud login**.

# SEE ALSO

[ibmcloud](/man/ibmcloud)(1), [ibmcloud-login](/man/ibmcloud-login)(1)

