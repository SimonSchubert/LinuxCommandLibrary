# TAGLINE

pipe command output and files to Slack channels

# TLDR

**Run first-time OAuth setup**

```slackcat --configure```

**Send a one-shot message** to a channel

```slackcat -c [channel] -m "[hello]"```

**Pipe stdin** into Slack as a snippet

```[command] | slackcat -c [channel]```

**Upload a file**

```slackcat -c [channel] [file.txt]```

**Override the upload filename / filetype**

```slackcat -c [channel] -n [log.py] --filetype [python] [file.py]```

**Also print to stdout** (tee mode)

```[command] | slackcat -c [channel] --tee```

**Stream tail output** into Slack

```tail -f [/var/log/app.log] | slackcat -c [channel] --stream```

**Dry run** (don't actually post)

```[command] | slackcat -c [channel] --noop```

**Use a different profile** from the config file

```slackcat -p [profile] -c [channel] [file]```

# SYNOPSIS

**slackcat** [_-c channel_] [_-m message_] [_options_] [_file_]

# PARAMETERS

**-c**, **--channel** _CHANNEL_
> Target channel (public/private) or group. Required unless set in config.

**-m**, **--message** _TEXT_
> Post _TEXT_ as a message (don't read stdin or file).

**-n**, **--filename** _NAME_
> Override the filename shown in Slack when uploading a snippet.

**--filetype** _TYPE_
> Explicit Slack filetype for syntax highlighting (`python`, `shell`, `javascript`, …). Useful when piping stdin.

**--comment** _TEXT_
> Initial comment attached to a snippet upload.

**-p**, **--profile** _NAME_
> Use a specific profile from the slackcat config file.

**--tee**
> Copy input to stdout as well as to Slack.

**--stream**
> Treat input as a live stream; keep posting updates as new data arrives instead of buffering a single snippet.

**--noop**
> Do not actually upload; print what would be sent.

**--configure**
> Run interactive OAuth configuration to create/update the slackcat config.

**-h**, **--help**
> Show help.

**-v**, **--version**
> Show version.

# CONFIGURATION

**~/.slackcat**
> INI-style config with `[default]` and named profile sections. Keys include `token`, `team`, `default_channel`.

Slack tokens must have `files:write`, `chat:write`, and related scopes. `slackcat --configure` walks through OAuth to set these.

# CAVEATS

Requires a Slack app / user token. Slack rate-limits uploads and chat messages (tier-dependent). Very large files or high-frequency streams may hit the 1 MB/message snippet limit — `--stream` rotates to a new snippet when that happens.

# HISTORY

**slackcat** was created by **Bradley Cicenas** (`bcicen`) and is written in **Go**. Source: github.com/bcicen/slackcat.

# SEE ALSO

[curl](/man/curl)(1), [tee](/man/tee)(1), [jq](/man/jq)(1)
