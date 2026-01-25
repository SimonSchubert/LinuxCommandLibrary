# TLDR

**Check password strength**

```echo "[password]" | pwqcheck```

**Check with old password**

```pwqcheck -1 [old_password] [new_password]```

**Check from stdin**

```pwqcheck < [password_file]```

**Custom config**

```pwqcheck config=[/path/to/pwquality.conf]```

# SYNOPSIS

**pwqcheck** [_options_] [_check_params_]

# PARAMETERS

**-1**
> Read old password, new password on stdin.

**-2**
> Read new password only.

**config=**_file_
> Use specified config file.

**min=**_n_
> Minimum password length.

**max=**_n_
> Maximum password length.

# DESCRIPTION

**pwqcheck** checks password quality according to configurable rules. It's part of passwdqc for enforcing password policies.

Returns OK or an error message describing the weakness.

# EXAMPLES

```bash
# Check single password
echo "mypassword" | pwqcheck

# With old password (change validation)
echo -e "oldpass\nnewpass" | pwqcheck -1

# Custom policy
echo "Test123!" | pwqcheck min=8 max=40

# In script
if echo "$password" | pwqcheck > /dev/null 2>&1; then
    echo "Password OK"
fi
```

# ERROR MESSAGES

```
Bad passphrase (too short)
Bad passphrase (not enough classes)
Bad passphrase (based on dictionary word)
Bad passphrase (too similar to old)
```

# CAVEATS

Part of passwdqc package. Different from pwquality/pam_pwquality. Check return code for validation.

# HISTORY

pwqcheck is part of **passwdqc** by **Solar Designer**, providing proactive password quality checking.

# SEE ALSO

[pwqgen](/man/pwqgen)(1), [passwd](/man/passwd)(1), [pam_passwdqc](/man/pam_passwdqc)(8)
