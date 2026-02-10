# TAGLINE

ends the current IBM Cloud CLI session

# TLDR

**Logout from IBM Cloud**

```ibmcloud logout```

**Logout and clear cache**

```ibmcloud logout -a```

# SYNOPSIS

**ibmcloud logout** [_options_]

# PARAMETERS

**-a**, **--all**
> Clear all cached data.

**--help**
> Display help information.

# DESCRIPTION

**ibmcloud logout** ends the current IBM Cloud CLI session. It removes stored credentials and tokens.

The command clears authentication state locally. Use before switching accounts or for security.

# CAVEATS

Local credentials only. API keys remain valid. Re-login required after.

# HISTORY

ibmcloud logout is part of the **IBM Cloud** CLI authentication system.

# SEE ALSO

[ibmcloud](/man/ibmcloud)(1), [ibmcloud-login](/man/ibmcloud-login)(1)
