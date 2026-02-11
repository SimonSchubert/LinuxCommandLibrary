# TAGLINE

Weblate translation management client

# TLDR

**List projects (using wlc client)**

```wlc list-projects```

**List components**

```wlc list-components [project/component]```

**Download translations**

```wlc download [project/component/language]```

**Upload translation file**

```wlc upload [project/component/language] [file.po]```

**Lock component for editing**

```wlc lock [project/component]```

**Push changes to repository**

```wlc push [project/component]```

**Show component stats**

```wlc stats [project/component]```

# SYNOPSIS

**wlc** [_options_] _command_ [_arguments_]

# WLC COMMANDS

**list-projects**: List all projects.

**list-components**: List components in project.

**list-translations**: List translations.

**show**: Show object details.

**download**: Download translation file.

**upload**: Upload translation file.

**lock** / **unlock**: Lock/unlock translations.

**push** / **pull**: Sync with repository.

**commit**: Commit pending changes.

**stats**: Show translation statistics.

# PARAMETERS

**--url** _url_
> Weblate server URL.

**--key** _key_
> API key for authentication.

**--format** _fmt_
> Output format (text, csv, json, html).

**-o** _file_
> Output to file.

# DESCRIPTION

**wlc** (Weblate Client) manages Weblate translation servers remotely via the REST API. It enables automation of translation workflows, continuous localization, and integration with build systems.

The client handles common tasks: downloading/uploading translations, triggering repository syncs, locking during releases, and querying statistics. Configuration in ~/.config/weblate stores server URLs and API keys.

Server-side management uses Django's manage.py or the weblate script for database operations, import/export, and administration tasks.

# CONFIGURATION

Config file: ~/.config/weblate

Contains server URLs and API keys for authentication.

# CAVEATS

Requires API key from Weblate server. Rate limits may apply. Some operations require appropriate permissions on the server.

# HISTORY

**Weblate** was created by Michal Čihař as a web-based continuous localization system. The wlc client enables command-line and scripted interaction with Weblate servers, supporting automated translation workflows.

# SEE ALSO

[gettext](/man/gettext)(1), [msgfmt](/man/msgfmt)(1), [poedit](/man/poedit)(1)
