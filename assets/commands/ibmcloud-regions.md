# TAGLINE

lists all available IBM Cloud regions

# TLDR

**List** all regions

```ibmcloud regions```

**Set** the API endpoint first, then list regions

```ibmcloud api https://cloud.ibm.com && ibmcloud regions```

# SYNOPSIS

**ibmcloud** **regions**

# DESCRIPTION

**ibmcloud regions** prints the name and public endpoint of every IBM Cloud region reachable from the targeted API endpoint. Region names such as `us-south`, `us-east`, `eu-gb`, `eu-de`, `eu-es`, `au-syd`, `jp-tok`, `jp-osa`, `ca-tor`, and `br-sao` are the values accepted by **ibmcloud login -r** and **ibmcloud target -r**.

The command takes no options and does not require a login, but the API endpoint must be set first with **ibmcloud api** or by a previous login.

# CAVEATS

The listed regions are the platform regions of the targeted endpoint. Individual services are not available in every region, and private endpoints (`private.cloud.ibm.com`) expose only a subset. Availability zones inside a region are not shown here; use the relevant service plugin, for example **ibmcloud ks zone ls**.

# HISTORY

**ibmcloud regions** is part of the IBM Cloud CLI, which replaced the earlier `bluemix` (`bx`) CLI when Bluemix was rebranded to IBM Cloud around **2018**.

# SEE ALSO

[ibmcloud](/man/ibmcloud)(1), [ibmcloud-target](/man/ibmcloud-target)(1), [ibmcloud-api](/man/ibmcloud-api)(1), [ibmcloud-login](/man/ibmcloud-login)(1)

# RESOURCES

```[Homepage](https://cloud.ibm.com/docs/cli)```

```[Documentation](https://cloud.ibm.com/docs/cli?topic=cli-ibmcloud_cli)```

<!-- verified: 2026-08-30 -->
