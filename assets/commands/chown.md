# TLDR

**Change** owner

```chown [user] [file]```

**Change** owner and group

```chown [user]:[group] [file]```

**Recursive** change

```chown -R [user]:[group] [directory/]```

**Change** group only

```chown :[group] [file]```

# SYNOPSIS

**chown** [_options_] _owner_[:_group_] _file_...

# DESCRIPTION

**chown** (change owner) modifies file ownership. It can change the user owner, group owner, or both. File ownership determines who has ultimate control over file permissions.

The command typically requires root privileges to change ownership to other users.

# PARAMETERS

**-R**, **--recursive**
> Change files and directories recursively

**-v**, **--verbose**
> Verbose output

**-c**, **--changes**
> Report only changes

**--reference=**_file_
> Use ownership from reference file

**-h**, **--no-dereference**
> Affect symbolic links instead of targets

**--from=**_current_owner_
> Change only if current owner matches

# OWNERSHIP FORMAT

**user**
> Change user owner only

**user:group**
> Change user and group

**user:**
> Change user and set group to user's login group

**:group**
> Change group only (same as chgrp)

# WORKFLOW

```bash
# Change owner
sudo chown alice file.txt

# Change owner and group
sudo chown alice:developers file.txt

# Change owner, group to user's login group
sudo chown alice: file.txt

# Change group only
sudo chown :www-data file.txt

# Recursive change
sudo chown -R alice:developers project/

# Use reference file
sudo chown --reference=template.txt newfile.txt

# Change only if owned by specific user
sudo chown --from=bob alice file.txt
```

# COMMON USES

**Web server files:**
```bash
sudo chown -R www-data:www-data /var/www/html
```

**User home directory:**
```bash
sudo chown -R alice:alice /home/alice
```

**Restore ownership:**
```bash
sudo chown -R $(whoami):$(whoami) ~/myproject
```

# CAVEATS

Usually requires root/sudo. Changing ownership removes some security features (like setuid). Recursive changes can break system files. Cannot change ownership to users that don't exist. Symbolic links handled differently depending on options.

# HISTORY

**chown** has been part of Unix since the early **1970s** as part of the file ownership security model.

# SEE ALSO

[chmod](/man/chmod)(1), [chgrp](/man/chgrp)(1), [ls](/man/ls)(1), [stat](/man/stat)(1)
