# TAGLINE

simple password manager that stores passwords in GPG-encrypted files organized

# TLDR

**Initialize password store** with GPG key

```pass init [gpg-id]```

**List all passwords**

```pass```

**Show a password**

```pass [folder/name]```

**Copy password** to clipboard

```pass -c [folder/name]```

**Generate new password**

```pass generate [folder/name] [20]```

**Generate without symbols**

```pass generate -n [folder/name] [20]```

**Insert a password**

```pass insert [folder/name]```

**Edit a password**

```pass edit [folder/name]```

**Remove a password**

```pass rm [folder/name]```

**Search passwords**

```pass grep [search_term]```

**Sync with git**

```pass git push```

# SYNOPSIS

**pass** [_command_] [_args_...]

# DESCRIPTION

**pass** (password-store) is a simple password manager that stores passwords in GPG-encrypted files organized in a directory hierarchy. Each password is stored in a separate file, encrypted with one or more GPG keys.

The password store is a directory tree at ~/.password-store, with each file containing a single password and optionally additional data. Git integration enables version control and synchronization.

pass provides a simple, Unix-philosophy approach to password management, using existing tools (GPG, git, tree) rather than custom databases.

# PARAMETERS

**init** _gpg-id_
> Initialize password store.

**ls** [_subfolder_]
> List passwords.

**show** _name_
> Decrypt and show password.

**insert** _name_
> Insert new password.

**edit** _name_
> Edit password with editor.

**generate** _name_ [_length_]
> Generate new password.

**rm** _name_
> Remove password.

**mv** _old_ _new_
> Move/rename password.

**cp** _old_ _new_
> Copy password.

**grep** _pattern_
> Search decrypted files.

**git** _args_
> Execute git command.

**-c**, **--clip**
> Copy to clipboard instead of displaying.

**-n**, **--no-symbols**
> Generate password without symbols.

# CAVEATS

Requires GPG key for encryption. Filenames (password paths) are not encrypted. Clipboard contents may be logged. Git history retains old passwords unless history is rewritten.

# HISTORY

**pass** was created by **Jason Donenfeld** (zx2c4) in **2012** as a minimalist password manager following Unix philosophy. It gained popularity for its simplicity and use of standard tools. The project spawned many compatible clients and extensions for browsers and mobile devices.

# SEE ALSO

[gpg](/man/gpg)(1), [git](/man/git)(1), [pwgen](/man/pwgen)(1), [gopass](/man/gopass)(1)
