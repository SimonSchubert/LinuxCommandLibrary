# TLDR

**Show current API endpoint**

```ibmcloud api```

**Set API endpoint**

```ibmcloud api [https://cloud.ibm.com]```

**Use private endpoint**

```ibmcloud api private.cloud.ibm.com```

**Use VPC private endpoint**

```ibmcloud api [endpoint] --vpc```

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

**ibmcloud api** sets or displays the IBM Cloud API endpoint. Without arguments, shows the current endpoint. Set to private.cloud.ibm.com for private network access. Required before logging in with **ibmcloud login**.

# SEE ALSO

[ibmcloud](/man/ibmcloud)(1), [ibmcloud-login](/man/ibmcloud-login)(1)

