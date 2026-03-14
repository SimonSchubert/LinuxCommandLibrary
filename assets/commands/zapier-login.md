# TAGLINE

Authenticate with Zapier platform

# TLDR

**Login to Zapier** interactively

```zapier login```

**Login with SSO** (for Google, Facebook, or Microsoft accounts)

```zapier login --sso```

# SYNOPSIS

**zapier** **login** [_options_]

# PARAMETERS

**--sso**
> Use SSO authentication. Required if you log into Zapier via single sign-on (Google, Facebook, or Microsoft) and do not have a Zapier password. Prompts you to enter a deploy key generated from your Zapier developer account.

# DESCRIPTION

**zapier login** authenticates with the Zapier platform and stores credentials in **~/.zapierrc**. Opens a browser for authentication. Required before using other Zapier CLI commands.

As an alternative to interactive login, you can set the **ZAPIER_DEPLOY_KEY** environment variable to run privileged commands without user input.

# SEE ALSO

[zapier](/man/zapier)(1), [zapier-test](/man/zapier-test)(1)
