# TAGLINE

authenticates to IBM Cloud

# TLDR

**Login** interactively

```ibmcloud login```

**Login** with a federated (SSO) ID

```ibmcloud login --sso```

**Login** with an API key

```ibmcloud login --apikey [API_KEY]```

**Login** with an API key read from a file

```ibmcloud login --apikey @[keyfile]```

**Login** with username and password and target an account

```ibmcloud login -u [user@example.com] -p [password] -c [ACCOUNT_ID]```

**Login** and target a region and resource group

```ibmcloud login -r [us-south] -g [Default]```

**Login** to a private API endpoint

```ibmcloud login -a [private.cloud.ibm.com]```

**Login** as a compute resource linked to a trusted profile

```ibmcloud login --cr-token @[tokenfile] --profile [profile_name]```

# SYNOPSIS

**ibmcloud** **login** [_options_]

# PARAMETERS

**-a** _API_ENDPOINT_
> API endpoint, for example `cloud.ibm.com`, or `private.cloud.ibm.com` to log in over a private endpoint.

**-u** _USERNAME_
> User name. Optional; prompted for when omitted.

**-p** _PASSWORD_
> Password. Optional; prompted for when omitted.

**--sso**
> Log in with a federated ID. The CLI prints a URL that yields a one-time passcode.

**--apikey** _API_KEY_|@_FILE_
> API key content, or the path of a file holding the key prefixed with `@`.

**--cr-token** _TOKEN_|@_FILE_
> Compute resource token content, or the path of a token file.

**--vpc-cri**
> Log in as a VPC virtual server instance compute resource identity.

**--profile** _PROFILE_
> Name, ID, or CRN of the linked trusted IAM profile used to obtain the access token. Requires `--cr-token`, `IBMCLOUD_CR_TOKEN`, or `--vpc-cri`.

**-c** _ACCOUNT_ID_
> ID of the target account. Mutually exclusive with `--no-account`.

**--no-account**
> Force login without an account. Not recommended.

**--accept**
> Accept an invitation to join the targeted account.

**-g** _RESOURCE_GROUP_
> Name or ID of the target resource group.

**-r** _REGION_
> Name of the target region, for example `us-south` or `eu-gb`.

**--no-region**
> Force login without targeting a region.

**--skip-ssl-validation**
> Bypass SSL validation of HTTP requests. Not recommended.

**--vpc**
> Use a VPC connection for a private API endpoint.

# DESCRIPTION

**ibmcloud login** authenticates the CLI against IBM Cloud and stores the resulting IAM tokens in the configuration directory. It supports interactive prompts, federated single sign-on, API keys, and compute resource identities backed by trusted profiles.

Login also sets the initial target. Account, region, and resource group can be selected inline with **-c**, **-r**, and **-g**, or changed later with **ibmcloud target**. Without **-r** the CLI prompts for a region; **--no-region** skips that prompt.

Tokens expire and are refreshed automatically while the session is valid. Run **ibmcloud logout** to discard them.

# ENVIRONMENT

**IBMCLOUD_API_KEY**
> API key used for non-interactive login. Accepts a key string or `@filename`.

**IBMCLOUD_CR_TOKEN**
> Compute resource token used for login, as a string or `@filename`.

**IBMCLOUD_CR_PROFILE**
> Name, ID, or CRN of the trusted profile to assume.

**IBMCLOUD_HOME**
> Directory holding the session metadata, so that parallel sessions can use separate credentials.

# CAVEATS

An API key created for a specific account cannot be used to switch to another account after login.

Passing **-p** on the command line leaves the password in the shell history and in the process list; prefer an API key or the interactive prompt.

Federated accounts must use **--sso**; plain **-u**/**-p** login fails for them.

# HISTORY

**ibmcloud login** is part of the IBM Cloud CLI, which replaced the earlier `bluemix` (`bx`) CLI when Bluemix was rebranded to IBM Cloud around **2018**.

# SEE ALSO

[ibmcloud](/man/ibmcloud)(1), [ibmcloud-logout](/man/ibmcloud-logout)(1), [ibmcloud-target](/man/ibmcloud-target)(1), [ibmcloud-api](/man/ibmcloud-api)(1), [ibmcloud-iam](/man/ibmcloud-iam)(1)

# RESOURCES

```[Homepage](https://cloud.ibm.com/docs/cli)```

```[Documentation](https://cloud.ibm.com/docs/cli?topic=cli-ibmcloud_cli)```

<!-- verified: 2026-08-30 -->
