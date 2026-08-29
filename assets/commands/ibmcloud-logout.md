# TAGLINE

ends the current IBM Cloud CLI session

# TLDR

**Log out** of IBM Cloud

```ibmcloud logout```

**Log out** of an isolated session directory

```IBMCLOUD_HOME=[/path/to/session] ibmcloud logout```

# SYNOPSIS

**ibmcloud** **logout**

# DESCRIPTION

**ibmcloud logout** ends the current CLI session. It discards the IAM access and refresh tokens stored in the configuration directory, so subsequent commands that need authentication fail until **ibmcloud login** is run again.

The command takes no options. The targeted API endpoint set with **ibmcloud api** is kept, as are CLI settings written by **ibmcloud config**.

# ENVIRONMENT

**IBMCLOUD_HOME**
> Directory holding the session metadata. Set it to log out of one of several parallel sessions.

# CAVEATS

Logging out only clears credentials on this machine. API keys and service ID keys stay valid until they are deleted with **ibmcloud iam api-key-delete**, and already-issued tokens remain valid until they expire.

Sessions are per configuration directory, so a logout does not affect shells that point **IBMCLOUD_HOME** somewhere else.

# HISTORY

**ibmcloud logout** is part of the IBM Cloud CLI, which replaced the earlier `bluemix` (`bx`) CLI when Bluemix was rebranded to IBM Cloud around **2018**.

# SEE ALSO

[ibmcloud](/man/ibmcloud)(1), [ibmcloud-login](/man/ibmcloud-login)(1), [ibmcloud-target](/man/ibmcloud-target)(1)

# RESOURCES

```[Homepage](https://cloud.ibm.com/docs/cli)```

```[Documentation](https://cloud.ibm.com/docs/cli?topic=cli-ibmcloud_cli)```

<!-- verified: 2026-08-30 -->
