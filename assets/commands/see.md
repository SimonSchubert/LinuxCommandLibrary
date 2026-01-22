# TLDR

**View** a file using mailcap entry

```see filename```

Equivalent using **run-mailcap**

```run-mailcap --action=view filename```

# SYNOPSIS

**see** _file_

# DESCRIPTION

**see** is an alias to run-mailcap's view action. It opens files using the appropriate viewer based on MIME type as configured in the mailcap database.

Commonly used to view images, documents, and other file types with their default handlers.

# CAVEATS

Behavior depends on mailcap configuration. Some MIME types may not have configured viewers.

# HISTORY

Part of **mime-support** package, providing convenient file viewing based on MIME types.

# SEE ALSO

[run-mailcap](/man/run-mailcap)(1), [xdg-open](/man/xdg-open)(1)
