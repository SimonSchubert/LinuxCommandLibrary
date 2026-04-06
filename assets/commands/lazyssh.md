# TAGLINE

Terminal-based interactive SSH manager

# TLDR

**Launch the SSH manager UI**

```lazyssh```

# SYNOPSIS

**lazyssh**

# KEYBINDINGS

**/**
> Toggle search bar.

**Up/Down** or **j/k**
> Navigate servers.

**Enter**
> SSH into selected server.

**c**
> Copy SSH command to clipboard.

**g**
> Ping selected server.

**r**
> Refresh background data.

**a**
> Add server.

**e**
> Edit server.

**t**
> Edit tags.

**d**
> Delete server.

**p**
> Pin/Unpin server.

**s**
> Toggle sort field.

**S**
> Reverse sort order.

**q**
> Quit.

# DESCRIPTION

**lazyssh** is a keyboard-driven SSH manager that makes it easy to browse, connect to, and manage servers directly from the command line. It reads servers from your **~/.ssh/config** and displays them in a scrollable interface.

Features include fuzzy search by alias, IP, or tags, adding or editing SSH config entries, pinning favorite servers, pinging servers to test connectivity, tagging for categorization, port forwarding configuration, and connection multiplexing. You can SSH into a selected server with a single keypress.

All SSH connections are executed through the system's native **ssh** binary. Private keys, passwords, and credentials are never stored, transmitted, or modified by lazyssh. A backup of your SSH config is created automatically before any changes.

# CAVEATS

Requires an existing **~/.ssh/config** file. Relies on the system's OpenSSH binary for connections.

# HISTORY

**lazyssh** was created by **Adembc** and is written in **Go** using tview and tcell. It was inspired by lazydocker and k9s.

# SEE ALSO

[ssh](/man/ssh)(1), [ssh-keygen](/man/ssh-keygen)(1)
