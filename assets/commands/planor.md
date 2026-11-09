# TAGLINE

TUI client for cloud services like AWS, Vultr, and Heroku

# TLDR

Launch for an **AWS profile**

```planor -c aws -p [profile_name]```

Launch for **Vultr**, naming the variable that holds the API key

```VULTR_API_KEY=[key] planor -c vultr -p VULTR_API_KEY```

Launch for **Heroku**

```HEROKU_API_KEY=[key] planor -c heroku -p HEROKU_API_KEY```

Launch for **Render**

```RENDER_API_KEY=[key] planor -c render -p RENDER_API_KEY```

# SYNOPSIS

**planor** [**-c** _provider_] **-p** _profile_

# PARAMETERS

**-c** _PROVIDER_
> Cloud provider, such as aws (default), vultr, heroku or render.

**-p** _PROFILE_
> Required. AWS profile name, or the name of the environment variable holding the API key for other providers.

# DESCRIPTION

**planor** is a terminal user interface for managing multiple cloud platforms including AWS (EC2, CodePipeline, CloudWatch Logs), Heroku, Vultr, Render, and Fleek. It provides a text-based interface for interacting with cloud services, managing resources, and monitoring deployments without using web dashboards.

Press **r** to refresh the data after launching. **Ctrl+p** and **Ctrl+n** switch tabs, **Tab** switches focus, **j** and **k** move in lists, **q** quits.

# CAVEATS

The upstream repository is archived and the last release is v0.5.1 from August 2022. AWS profiles must be configured in **~/.aws/config** and **~/.aws/credentials**.

# HISTORY

**planor** was created by **mrusme** and is written in **Go**.

# INSTALL

```aur: yay -S planor```

<!-- packages: 2026-11-09 -->

# SEE ALSO

[aws](/man/aws)(1), [terraform](/man/terraform)(1)

# RESOURCES

```[Source code](https://github.com/mrusme/planor)```

<!-- verified: 2026-11-09 -->
