# TAGLINE

Profile PHP application performance

# TLDR

**Profile a PHP script**

```blackfire run php [script.php]```

**Profile with arguments**

```blackfire run php [script.php] --arg1 [value]```

**Profile an HTTP request** using curl

```blackfire curl [https://example.com/page]```

**Profile to a specific environment**

```blackfire --env=[ENV_UUID] run php [script.php]```

**Get JSON output** of profile results

```blackfire --json run php [script.php]```

**Profile with quiet output** (no URL displayed)

```blackfire -q run php [script.php]```

**Profile a Symfony console command**

```blackfire run php bin/console [command:name]```

# SYNOPSIS

**blackfire** [_options_] _subcommand_ [_arguments_]

# DESCRIPTION

**blackfire** is the CLI tool for the Blackfire profiler, a performance management solution for PHP applications. It profiles PHP scripts, HTTP requests, and web applications to identify performance bottlenecks.

The tool integrates with Blackfire.io cloud services to provide detailed flame graphs, call graphs, and performance recommendations. Profiles can be compared to track performance changes over time.

# SUBCOMMANDS

**run**
> Profile a PHP CLI script or command

**curl**
> Profile an HTTP request (uses system curl)

**upload**
> Upload a profile to Blackfire.io

**client:config**
> Configure client credentials

**agent:config**
> Configure agent settings

# PARAMETERS

**--env** _uuid_
> Target environment UUID for the profile

**--json**
> Output profile results in JSON format

**-q, --quiet**
> Suppress output (do not display profile URL)

**--samples** _n_
> Number of samples to collect

**--title** _text_
> Set a title for the profile

**--external-id** _id_
> Set an external identifier for the profile

**--ignore-exit-status**
> Ignore non-zero exit status from profiled command

# CONFIGURATION

**/etc/blackfire/agent**
> Blackfire agent configuration including server credentials and socket settings.

**~/.blackfire.ini**
> Client-side configuration with client ID and token for authentication.

# CAVEATS

Requires a Blackfire account and properly configured credentials (BLACKFIRE_CLIENT_ID and BLACKFIRE_CLIENT_TOKEN). The Blackfire PHP extension must be installed for profiling to work. The **curl** subcommand requires curl to be installed on the system.

# HISTORY

Blackfire was created by **SensioLabs** (the company behind Symfony) and launched in **2014** as a commercial profiling solution. It evolved from the open-source xhprof profiler and provides continuous performance monitoring for PHP applications.

# SEE ALSO

[php](/man/php)(1), [xdebug](/man/xdebug)(1), [curl](/man/curl)(1)
