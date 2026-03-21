# TAGLINE

View and configure Zapier CLI analytics collection

# TLDR

**Show current analytics status**

```zapier analytics```

**Enable full analytics collection**

```zapier analytics -m enabled```

**Set anonymous analytics mode**

```zapier analytics -m anonymous```

**Disable analytics collection**

```zapier analytics -m disabled```

# SYNOPSIS

**zapier** **analytics** [_-m mode_]

# PARAMETERS

**-m**, **--mode** _MODE_
> Set analytics collection mode: enabled (default, sends command info, OS type, and user ID), anonymous (sends command info only), or disabled (no data collected).

# DESCRIPTION

**zapier analytics** shows the status of analytics collection for the Zapier CLI and allows changing what data is collected. By default, analytics are enabled and include information about the integration, CLI commands, operating system, and Zapier user ID.

In anonymous mode, OS type and user ID are omitted but command information is still sent. Analytics can also be disabled entirely by running zapier analytics -m disabled or by setting the DISABLE_ZAPIER_ANALYTICS environment variable to 1.

To see exactly what is being collected at runtime, prefix any command with DEBUG=zapier:analytics.

# SEE ALSO

[zapier](/man/zapier)(1), [zapier-history](/man/zapier-history)(1), [zapier-push](/man/zapier-push)(1), [zapier-validate](/man/zapier-validate)(1)
