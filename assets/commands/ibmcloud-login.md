# TLDR

**Login interactively**

```ibmcloud login```

**Login with SSO**

```ibmcloud login --sso```

**Login with API key**

```ibmcloud login --apikey [API_KEY]```

**Login to specific region**

```ibmcloud login -r [us-south]```

**Login with username and password**

```ibmcloud login -u [user@example.com] -p [password]```

**Login to specific API endpoint**

```ibmcloud login -a [https://cloud.ibm.com]```

**Login with API key from file**

```ibmcloud login --apikey @[keyfile]```

# SYNOPSIS

**ibmcloud** **login** [_options_]

# PARAMETERS

**-u** _user_
> Username (email).

**-p** _password_
> Password.

**--sso**
> Use single sign-on (federated ID).

**--apikey** _key_
> API key for authentication.

**-a** _endpoint_
> API endpoint URL.

**-r** _region_
> Target region.

**-c** _account_
> Target account ID.

**-o** _org_
> Target organization.

**-s** _space_
> Target space.

# DESCRIPTION

**ibmcloud login** authenticates to IBM Cloud. Supports interactive login, SSO for federated IDs, and API key authentication. After login, use **ibmcloud target** to set account, region, or resource group context. Environment variables IC_API_KEY, IC_API_ENDPOINT, and IC_REGION can be used for automation.

# SEE ALSO

[ibmcloud](/man/ibmcloud)(1), [ibmcloud-target](/man/ibmcloud-target)(1), [ibmcloud-api](/man/ibmcloud-api)(1)

