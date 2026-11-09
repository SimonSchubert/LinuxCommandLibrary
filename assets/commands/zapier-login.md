# TAGLINE

Authenticate with Zapier platform

# TLDR

**Login to Zapier** interactively

```zapier-platform login```

**Login with SSO** (for Google, Facebook, or Microsoft accounts)

```zapier-platform login --sso```

# SYNOPSIS

**zapier-platform** **login** [_options_]

# PARAMETERS

**-s**, **--sso**
> Use SSO authentication. Required if you log into Zapier via single sign-on (Google, Facebook, or Microsoft) and do not have a Zapier password. Prompts you to enter a deploy key generated from your Zapier developer account.

**-d**, **--debug**
> Show extra debugging output.

# DESCRIPTION

**zapier-platform login** authenticates with the Zapier platform and stores a deploy key in **~/.zapierrc**, or in the path set by **ZAPIER_AUTH_LOCATION**. It prompts for your email address and password, plus a 6-digit code if two-factor authentication is enabled. Accounts that use SAML, or **--sso**, are asked to paste a deploy key instead. Required before using commands that talk to Zapier.

As an alternative to interactive login, you can set the **ZAPIER_DEPLOY_KEY** environment variable to run privileged commands without user input.

Note: The CLI binary was renamed from **zapier** to **zapier-platform** in v18.0.0, and the legacy **zapier** binary was removed in v19.

# SEE ALSO

[zapier](/man/zapier)(1), [zapier-test](/man/zapier-test)(1), [zapier-push](/man/zapier-push)(1), [zapier-validate](/man/zapier-validate)(1)

# RESOURCES

```[Source code](https://github.com/zapier/zapier-platform)```

```[Documentation](https://docs.zapier.com/integrations/build-cli/overview)```

<!-- verified: 2026-11-09 -->
