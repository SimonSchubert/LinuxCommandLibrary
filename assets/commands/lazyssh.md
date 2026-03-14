# TAGLINE

Terminal-based interactive SSH manager

# TLDR

**Launch the SSH manager UI**

```lazyssh```

# SYNOPSIS

**lazyssh** [_options_]

# DESCRIPTION

**lazyssh** is a keyboard-driven SSH manager that makes it easy to browse, connect to, and manage servers directly from the command line. It reads servers from your SSH config and displays them in a scrollable interface.

Features include fuzzy search by alias, IP, or tags, adding or editing SSH config entries, pinning favorite servers, pinging servers to test connectivity, and tagging for categorization. You can SSH into a selected server with a single keypress.

All SSH connections are executed through the system's native **ssh** binary. Private keys, passwords, and credentials are never stored, transmitted, or modified by lazyssh.

# CAVEATS

Requires an existing SSH configuration file. Relies on the system's OpenSSH binary for connections.

# HISTORY

**lazyssh** was created by **Adembc** and is written in **Go** using tview and tcell. It was inspired by lazydocker and k9s.

# SEE ALSO

[ssh](/man/ssh)(1)
