# TAGLINE

View the change history of a Zapier integration

# TLDR

**Show the history** of the current integration

```zapier-platform history```

**Show history as JSON** (pipeable to jq)

```zapier-platform history --format=json```

**Save history to a file** for auditing

```zapier-platform history --format=json > [history.json]```

**Show debug output**

```zapier-platform history --debug```

# SYNOPSIS

**zapier-platform** **history** [_options_]

# PARAMETERS

**-f**, **--format** _FORMAT_
> Output format: **plain**, **json**, **raw**, **row**, or **table** (default: table). Use **json** or **raw** to pipe into other tools.

**-d**, **--debug**
> Show extra debugging output.

# DESCRIPTION

**zapier-platform history** lists all changes made over the lifetime of a Zapier CLI integration: creation, version pushes, migrations, promotions, deprecations, and admin and invitee changes. Each row shows the action, a message, the user who made the change, the affected version, and the timestamp.

The command is useful for auditing rollouts, finding the version a migration moved users to, and spotting when a version was promoted to production.

# CAVEATS

Run inside an integration directory that is linked to a registered integration (see **zapier-platform link**), after authenticating with **zapier-platform login**. Older releases of the CLI installed the binary as **zapier**; current releases of **zapier-platform-cli** name it **zapier-platform**. There is no option to limit the number of entries; filter the JSON output (e.g. with **jq**) instead.

# SEE ALSO

[zapier](/man/zapier)(1), [zapier-versions](/man/zapier-versions)(1), [jq](/man/jq)(1)

# RESOURCES

```[Source code](https://github.com/zapier/zapier-platform)```

```[Documentation](https://github.com/zapier/zapier-platform/blob/main/packages/cli/docs/cli.md)```

<!-- verified: 2026-11-23 -->
