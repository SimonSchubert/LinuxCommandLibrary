# TAGLINE

Bitwarden password manager CLI

# TLDR

**Login** to Bitwarden

```bw login```

**Unlock** vault

```bw unlock```

**List** items

```bw list items```

**Get** password

```bw get password [example.com]```

**Create** item

```bw create item```

**Sync** vault

```bw sync```

# SYNOPSIS

**bw** _command_ [_options_]

# DESCRIPTION

**bw** is the official command-line interface for Bitwarden, an open-source password manager. It enables accessing and managing passwords, notes, and credentials from the terminal or in scripts.

The tool provides full access to Bitwarden vaults for automation and integration purposes.

# PARAMETERS

**--session** _key_
> Session key for authentication

**--organizationid** _id_
> Organization ID filter

**--pretty**
> Pretty-print JSON output

**--raw**
> Return raw value only

# COMMON COMMANDS

**login** [_email_]
> Log in to account

**unlock**
> Unlock vault (returns session key)

**lock**
> Lock vault

**sync**
> Sync vault with server

**list** _object_
> List items, folders, collections

**get** _object_ _id_
> Get specific item

**create** _object_ _encodedJson_
> Create new item

**edit** _object_ _id_ _encodedJson_
> Edit existing item

**delete** _object_ _id_
> Delete item

# WORKFLOW

```bash
# Login
bw login user@example.com

# Unlock vault (save session key)
export BW_SESSION="$(bw unlock --raw)"

# List all items
bw list items

# Get password
bw get password github.com

# Search items
bw list items --search "google"

# Get username
bw get username amazon.com

# Generate password
bw generate -ulns --length 20

# Create item
echo '{"name":"My Login","username":"user","password":"pass"}' | \
  bw encode | bw create item
```

# FEATURES

- Full vault access
- Password generation
- Secure note storage
- Two-factor authentication
- Organization support
- Self-hosted server support
- JSON output for scripting

# CAVEATS

Session key needed for most operations. Store session key securely (environment variable). Output is JSON (requires parsing). CLI requires unlocking frequently. Self-hosted servers need configuration.

# HISTORY

**Bitwarden CLI** was released around **2018** as part of the Bitwarden password manager to enable terminal and scripting access.

# SEE ALSO

[pass](/man/pass)(1), [gopass](/man/gopass)(1), [1password](/man/1password)(1)
