# TAGLINE

User-friendly socket statistics with a TUI

# TLDR

**View active socket connections**

```neoss```

# SYNOPSIS

**neoss** [_options_]

# DESCRIPTION

**neoss** is a user-friendly TUI that provides detailed TCP and UDP socket statistics. It aims to replace the usual **ss** command for basic usage with a clear and simple terminal interface that allows you to sort, refresh, and navigate through results.

The TUI displays in-use sockets with their respective statistics including local and remote addresses, states, and associated processes.

# CAVEATS

Requires elevated privileges for full process information. Available as an npm package.

# HISTORY

**neoss** was created by **PabloLec** and is written in **TypeScript**. It can be installed via `npm install -g neoss`.

# SEE ALSO

[ss](/man/ss)(8), [netstat](/man/netstat)(8)
