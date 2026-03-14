# TAGLINE

User-friendly socket statistics with a TUI

# TLDR

**View active socket connections**

```neoss```

**Install neoss globally via npm**

```npm install -g neoss```

# SYNOPSIS

**neoss**

# DESCRIPTION

**neoss** is a user-friendly TUI that provides detailed TCP and UDP socket statistics. It aims to replace the usual **ss** command for basic usage with a clear and simple terminal interface that allows you to sort, refresh, and navigate through results.

The TUI displays in-use sockets with their respective statistics including local and remote addresses, states, and associated processes. You can select any data point to get an explanation of its meaning.

# CAVEATS

Requires elevated privileges (sudo) for full process information. Requires Node.js and npm to install. Available as an npm package via `npm install -g neoss`.

# HISTORY

**neoss** was created by **PabloLec** and is written in **TypeScript**.

# SEE ALSO

[ss](/man/ss)(8), [netstat](/man/netstat)(8)
