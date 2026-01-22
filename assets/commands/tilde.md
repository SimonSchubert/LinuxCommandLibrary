# TLDR

**Home directory**

```cd ~```

**Another user's home directory**

```cd ~[username]```

**Previous directory**

```cd ~-```

**Current directory**

```echo ~+```

**Case modification (bash 4+)**

```echo ${var~~}```

# SYNOPSIS

**~**
**~**_username_
**~+**
**~-**

# TILDE EXPANSIONS

**~**
> Current user's home directory ($HOME)

**~username**
> Specified user's home directory

**~+**
> Current working directory ($PWD)

**~-**
> Previous working directory ($OLDPWD)

# PARAMETER EXPANSION (bash 4+)

**${var^}**
> Uppercase first character

**${var^^}**
> Uppercase all characters

**${var,}**
> Lowercase first character

**${var,,}**
> Lowercase all characters

**${var~}**
> Toggle case of first character

**${var~~}**
> Toggle case of all characters

# DESCRIPTION

**~** (tilde) is expanded by the shell to directory paths. It's a shorthand that avoids hardcoding paths like /home/user.

Tilde expansion only occurs at the start of a word or after **:**. In the middle of text, **~** is literal.

```bash
cd ~                    # Go home
cd ~/Documents          # Home subdirectory
cd ~root                # Root's home
PATH=$PATH:~/bin        # After : works
```

The **~+** and **~-** forms mirror the **pushd/popd** directory stack, allowing quick navigation between recent directories.

# EXAMPLES

```bash
# Copy to home
cp file.txt ~

# Use another user's home
sudo cp config ~www-data/

# Toggle between directories
cd /var/log
cd /etc
cd ~-     # Back to /var/log
cd ~-     # Back to /etc

# Case toggle (bash 4+)
name="Hello"
echo ${name~~}    # hELLO
```

# CAVEATS

Tilde only expands when unquoted and at word start. **"~"** is literal, not home.

**~user** looks up the user in the password database, not just string concatenation.

**~-** is empty if no previous directory (new shell).

# SEE ALSO

[cd](/man/cd)(1), [bash](/man/bash)(1), [pwd](/man/pwd)(1), [pushd](/man/pushd)(1)
