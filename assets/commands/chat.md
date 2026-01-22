# TLDR

Execute a **chat script** directly

```chat '[expect_send_pairs]'```

Execute a chat script from a **file**

```chat -f '[path/to/chat_script]'```

Set a custom **timeout**

```chat -t [timeout_in_seconds] '[expect_send_pairs]'```

Enable **verbose** output to syslog

```chat -v '[expect_send_pairs]'```

Use a **report file** for logging

```chat -r [path/to/report_file] '[expect_send_pairs]'```

**Dial** a phone number using a variable

```chat -T '[phone_number]' '"ATDT\\T CONNECT"'```

Include an **abort condition**

```chat 'ABORT "[error_string]" [expect_send_pairs]'```

# SYNOPSIS

**chat** [_options_] _script_

# DESCRIPTION

**chat** automates conversations with modems and serial devices. It sends strings and waits for expected responses, commonly used to establish PPP connections.

Scripts consist of expect-send pairs: the program waits for the expect string, then sends the send string.

# PARAMETERS

**-f** _file_
> Read script from file

**-t** _seconds_
> Timeout for expecting responses

**-v**
> Verbose logging to syslog

**-r** _file_
> Log specific strings to report file

**-T** _string_
> Substitute \T in script with string

**-V**
> Log all conversation to stderr

# SCRIPT SYNTAX

**ABORT** _string_
> Abort if string is received

**TIMEOUT** _seconds_
> Set timeout for next expect

**REPORT** _string_
> Log string to report file

# CAVEATS

Primarily used for legacy modem/PPP connections. Timing is critical; adjust timeouts for slow devices. Escape sequences may need proper quoting.

# SEE ALSO

[pppd](/man/pppd)(8), [expect](/man/expect)(1)
