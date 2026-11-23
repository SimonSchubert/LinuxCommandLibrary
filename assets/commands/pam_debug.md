# TAGLINE

PAM module that returns configurable results for debugging stacks

# TLDR

**Force success** in the auth stack

```auth optional pam_debug.so auth=success```

**Force a specific failure** code

```auth optional pam_debug.so auth=auth_err```

**Mark credentials unavailable** to test fallbacks

```auth optional pam_debug.so cred=cred_unavail```

**Force account stage failure**

```account required pam_debug.so acct=acct_expired```

**Stub out session callbacks**

```session optional pam_debug.so open_session=success close_session=success```

# SYNOPSIS

**pam_debug.so** [_arg=value_...]

# PARAMETERS

**auth=**_VALUE_
> Return code for **pam_sm_authenticate**.

**cred=**_VALUE_
> Return code for **pam_sm_setcred**.

**acct=**_VALUE_
> Return code for **pam_sm_acct_mgmt**.

**prechauthtok=**_VALUE_
> Return code for the **PAM_PRELIM_CHECK** stage of **pam_sm_chauthtok**.

**chauthtok=**_VALUE_
> Return code for the **PAM_UPDATE_AUTHTOK** stage of **pam_sm_chauthtok**.

**open_session=**_VALUE_
> Return code for **pam_sm_open_session**.

**close_session=**_VALUE_
> Return code for **pam_sm_close_session**.

_VALUE_ is the lower-case form of a PAM return constant: success, open_err, symbol_err, service_err, system_err, buf_err, perm_denied, auth_err, cred_insufficient, authinfo_unavail, user_unknown, maxtries, new_authtok_reqd, acct_expired, session_err, cred_unavail, cred_expired, cred_err, no_module_data, conv_err, authtok_err, authtok_recover_err, authtok_lock_busy, authtok_disable_aging, try_again, ignore, abort, authtok_expired, module_unknown, bad_item, conv_again, incomplete. Any unspecified hook returns **success**.

# DESCRIPTION

**pam_debug** is a Linux-PAM testing module that lets administrators script the return value of every PAM service-module hook. It is used to exercise PAM stacks under controlled failure conditions, verify that **required**, **requisite**, **sufficient**, and **optional** control flags behave as designed, and validate fallback paths in custom stacks.

The module performs no authentication of its own: it simply returns the requested code (or **PAM_SUCCESS** by default). When an argument matches, it sends the argument text as an informational message through the application's conversation function (**pam_info**), so the order in which modules execute can be traced. Each argument applies to exactly one of the four PAM management groups (auth, account, password, session).

# CAVEATS

Strictly a development and testing module. Loading it in **/etc/pam.d/** for a real service can bypass authentication entirely (for example, forcing **auth=success** in the **system-auth** stack). Distribute changes only in scratch configurations and remove them before deploying.

# HISTORY

**pam_debug** was written by **Andrew G. Morgan** and ships with **Linux-PAM** as part of the upstream source tree, alongside other diagnostic modules such as **pam_warn** and **pam_deny**. It is intended as a developer aid for module authors and PAM-stack maintainers.

# SEE ALSO

[pam](/man/pam)(8), [pam.d](/man/pam.d)(5), [pam.conf](/man/pam.conf)(5), [pam_deny](/man/pam_deny)(8), [pam_permit](/man/pam_permit)(8)

# RESOURCES

```[Source code](https://github.com/linux-pam/linux-pam)```

```[Documentation](https://man7.org/linux/man-pages/man8/pam_debug.8.html)```

<!-- verified: 2026-11-23 -->
