# TAGLINE

View and configure Zapier CLI analytics collection

# TLDR

**Show current analytics status**

```zapier-platform analytics```

**Enable full analytics collection**

```zapier-platform analytics -m enabled```

**Set anonymous analytics mode**

```zapier-platform analytics -m anonymous```

**Disable analytics collection**

```zapier-platform analytics -m disabled```

# SYNOPSIS

**zapier-platform** **analytics** [_-m mode_] [_-d_]

# PARAMETERS

**-m**, **--mode** _MODE_
> Set analytics collection mode: enabled (default, sends command info, OS type, and user ID), anonymous (sends command info only), or disabled (no data collected).

**-d**, **--debug**
> Show extra debugging output.

# DESCRIPTION

**zapier-platform analytics** shows the status of analytics collection for the Zapier CLI and allows changing what data is collected. By default, analytics are enabled and include information about the integration, CLI commands, operating system, and Zapier user ID.

In anonymous mode, OS type and user ID are omitted but command information is still sent. Analytics can also be disabled entirely by running zapier-platform analytics -m disabled or by setting the DISABLE_ZAPIER_ANALYTICS environment variable to a truthy value.

To see exactly what is being collected at runtime, prefix any command with DEBUG=zapier:analytics.

# CAVEATS

Since version 19 the CLI exposes only the **zapier-platform** command; the legacy **zapier** binary was removed.

# SEE ALSO

[zapier](/man/zapier)(1), [zapier-history](/man/zapier-history)(1), [zapier-push](/man/zapier-push)(1), [zapier-validate](/man/zapier-validate)(1)

# RESOURCES

```[Source code](https://github.com/zapier/zapier-platform)```

```[Documentation](https://docs.zapier.com/integrations/build-cli/overview)```

<!-- verified: 2026-11-09 -->
