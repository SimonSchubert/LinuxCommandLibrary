# TAGLINE

Create and query Postfix lookup tables

# TLDR

**Create hash database from text file**

```postmap [/etc/postfix/virtual]```

**Create database with specific type**

```postmap hash:[/etc/postfix/transport]```

**Query database**

```postmap -q [key] [/etc/postfix/virtual]```

**Show all entries**

```postmap -s [/etc/postfix/virtual]```

# SYNOPSIS

**postmap** [_options_] [_file_type:_]_name_

# PARAMETERS

**-q** _key_
> Query for key.

**-s**
> Show all entries.

**-d** _key_
> Delete key.

**-i**
> Incremental mode.

**-N**
> Include newlines in values.

**-w**
> Wait for locked files.

# DESCRIPTION

**postmap** creates and queries Postfix lookup tables. It converts plain text files containing key-value pairs into indexed database formats (hash, btree, dbm) for efficient lookups by the Postfix mail system. Common uses include virtual alias maps, transport maps, and access control tables.

After editing a text lookup file, postmap must be run to rebuild the corresponding .db file that Postfix actually reads. The query mode (-q) allows testing individual lookups, and the show mode (-s) displays all entries, both useful for verifying that mappings work as expected before applying them to live mail delivery.

# EXAMPLES

```bash
# Create virtual alias map
postmap /etc/postfix/virtual

# Create transport map
postmap hash:/etc/postfix/transport

# Query specific entry
postmap -q "user@example.com" /etc/postfix/virtual

# Show all mappings
postmap -s /etc/postfix/virtual

# Delete entry
postmap -d "olduser@example.com" /etc/postfix/virtual
```

# FILE FORMAT

```
# /etc/postfix/virtual
user@example.com    localuser
@example.com        catchall@other.com
```

# CAVEATS

Run postmap after editing text files. Postfix reads .db file, not text. Use postmap -q to verify.

# HISTORY

postmap is part of **Postfix**, the mail transfer agent created by **Wietse Venema** as a secure alternative to Sendmail.

# SEE ALSO

[postconf](/man/postconf)(1), [postalias](/man/postalias)(1), [postfix](/man/postfix)(1)
