# TLDR

**Extract headers from email**

```formail -x [Subject:] < [email.txt]```

**Add header to email**

```formail -a "[X-Custom: value]" < [email.txt]```

**Split mbox into messages**

```formail -s [command] < [mbox]```

**Extract From line**

```formail -x From: < [email.txt]```

**Force addition of header**

```formail -A "[X-Custom: value]" < [email.txt]```

**Generate auto-reply**

```formail -r < [email.txt]```

# SYNOPSIS

**formail** [_options_] [_output_] < _input_

# PARAMETERS

**-x** _header_
> Extract specific header.

**-X** _header_
> Extract header with continuation lines.

**-a** _header_
> Add header if not present.

**-A** _header_
> Add header always.

**-i** _header_
> Replace header.

**-u** _header_
> Make header unique.

**-r**
> Generate reply headers.

**-s** _command_
> Split and process with command.

**-b**
> Don't escape body "From " lines.

**-n** _count_
> Output only first n messages.

# DESCRIPTION

**formail** is a mail processing utility from the procmail suite. It extracts headers, adds or modifies headers, splits mbox files, and helps generate automated replies.

The tool reads from stdin and writes to stdout, designed for use in pipelines and procmail recipes. It handles RFC 822 mail format intricacies.

# EXAMPLES

```bash
# Split mbox and save each message
formail -s procmail < mbox

# Extract sender address
formail -x From: < message | head -1

# Add header for filtering
formail -a "X-Filtered: yes" < message
```

# CAVEATS

Part of procmail suite which is no longer actively developed. MIME handling is limited. Complex headers may need careful extraction. Consider modern alternatives for new projects.

# HISTORY

formail was developed by **Stephen van den Berg** as part of the **procmail** mail processing suite in the **1990s**. While procmail is no longer actively maintained, formail remains useful for mail processing scripts.

# SEE ALSO

[procmail](/man/procmail)(1), [mail](/man/mail)(1), [mailx](/man/mailx)(1), [mbox](/man/mbox)(5)
