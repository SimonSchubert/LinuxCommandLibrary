# TAGLINE

writes default values to the IBM Cloud CLI configuration file

# TLDR

**Set** the HTTP timeout in seconds

```ibmcloud config --http-timeout [60]```

**Enable** colored output

```ibmcloud config --color [true]```

**Trace** HTTP requests to the terminal

```ibmcloud config --trace [true]```

**Trace** HTTP requests to a file

```ibmcloud config --trace [/tmp/ibmcloud.log]```

**Set** the output locale

```ibmcloud config --locale [en_US]```

**Clear** the configured locale

```ibmcloud config --locale CLEAR```

**Disable** the CLI version check

```ibmcloud config --check-version [false]```

# SYNOPSIS

**ibmcloud** **config** **--http-timeout** _SECONDS_ | **--trace** (_true_|_false_|_path/to/file_) | **--color** (_true_|_false_) | **--locale** (_LOCALE_|_CLEAR_) | **--check-version** (_true_|_false_)

# PARAMETERS

**--http-timeout** _SECONDS_
> Timeout value for HTTP requests, in seconds. The default is 60.

**--trace** _true_|_false_|_PATH_
> Trace HTTP requests to the terminal, or append them to the given file.

**--color** _true_|_false_
> Enable or disable color output. Disabled by default.

**--locale** _LOCALE_|_CLEAR_
> Set the default output locale, for example `en_US`. `CLEAR` removes the setting.

**--check-version** _true_|_false_
> Enable or disable the CLI version check.

**--sso-otp** _manual_|_auto_
> Style of single sign-on one-time passcode retrieval. `manual` (the default) requires user interaction; `auto` launches the default browser and accepts the token.

**--alpha-commands** _true_|_false_
> Sort uncategorized commands alphabetically in help output.

# DESCRIPTION

**ibmcloud config** writes persistent defaults to the CLI configuration file. The settings apply to every `ibmcloud` invocation that uses the same configuration directory, which is `~/.bluemix` unless **IBMCLOUD_HOME** points elsewhere.

Only one option can be given per invocation. Each setting has a matching environment variable that overrides the stored value for a single command, which is handy in scripts and CI.

# ENVIRONMENT

**IBMCLOUD_HOME**
> Directory holding the configuration; the CLI reads and writes `$IBMCLOUD_HOME/.bluemix`.

**IBMCLOUD_COLOR**
> Overrides `--color` for one invocation.

**IBMCLOUD_HTTP_TIMEOUT**
> Overrides `--http-timeout` for one invocation.

**IBMCLOUD_TRACE**
> Overrides `--trace`; accepts `true` or a log file path.

**IBMCLOUD_VERSION_CHECK**
> Overrides `--check-version` for one invocation.

# CAVEATS

Only one option can be specified at a time; the CLI rejects two settings in the same command.

Traces contain full HTTP requests, including authorization headers, so a trace file can leak IAM tokens. Do not commit or share it.

The settings are per configuration directory, not global. Shells that set a different **IBMCLOUD_HOME** keep their own values.

# HISTORY

**ibmcloud config** is part of the IBM Cloud CLI, which replaced the earlier `bluemix` (`bx`) CLI when Bluemix was rebranded to IBM Cloud around **2018**.

# SEE ALSO

[ibmcloud](/man/ibmcloud)(1), [ibmcloud-login](/man/ibmcloud-login)(1), [ibmcloud-target](/man/ibmcloud-target)(1), [ibmcloud-api](/man/ibmcloud-api)(1)

# RESOURCES

```[Homepage](https://cloud.ibm.com/docs/cli)```

```[Documentation](https://cloud.ibm.com/docs/cli?topic=cli-ibmcloud_cli)```

<!-- verified: 2026-08-30 -->
