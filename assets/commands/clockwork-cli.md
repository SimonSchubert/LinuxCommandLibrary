# TAGLINE

PHP debugging and profiling tool CLI

# TLDR

**Start Clockwork server**

```clockwork-cli server```

**Show request logs**

```clockwork-cli show```

**Clear stored data**

```clockwork-cli clean```

# SYNOPSIS

**clockwork-cli** _command_ [_options_]

# DESCRIPTION

**clockwork-cli** is the command-line interface for Clockwork, a PHP debugging and profiling tool. It works with the Clockwork browser extension to provide detailed insights into Laravel, Slim, and other PHP framework requests, including database queries, cache operations, log entries, and timeline data.

The CLI manages the local Clockwork server that receives profiling data from your PHP application and serves it to the browser extension. It can also display request logs directly in the terminal and clean up stored profiling data.

# SEE ALSO

[php](/man/php)(1), [artisan](/man/artisan)(1)
