# TAGLINE

restricts root access through su to wheel group members

# TLDR

**Require wheel membership for su** (in /etc/pam.d/su)

```auth required pam_wheel.so use_uid```

**Apply the check only when the target is root**

```auth required pam_wheel.so root_only use_uid```

**Use a different group**

```auth required pam_wheel.so use_uid group=[admin]```

**Let wheel members su to root without a password**

```auth sufficient pam_wheel.so trust use_uid```

**Deny su to root for members of a group**

```auth required pam_wheel.so deny use_uid group=[nosu]```

# SYNOPSIS

**pam_wheel.so** [**debug**] [**deny**] [**group=**_name_] [**root_only**] [**trust**] [**use_uid**]

# PARAMETERS

**debug**
> Print debug information.

**deny**
> Reverse the result: members of the group requesting uid 0 are denied. Non-members get PAM_IGNORE, or PAM_SUCCESS if **trust** is also set.

**group=**_NAME_
> Check this group instead of wheel or gid 0.

**root_only**
> Check group membership only when the target user has uid 0.

**trust**
> Return PAM_SUCCESS instead of PAM_IGNORE for group members, so stacked modules can skip the password prompt.

**use_uid**
> Check the real uid of the calling process instead of the user associated with the terminal's login session.

# DESCRIPTION

**pam_wheel** permits access to the target user only if the applicant is a member of the **wheel** group. If no group with that name exists, the module uses the group with gid 0. It provides the **auth** and **account** module types and is typically enabled in /etc/pam.d/su.

# CAVEATS

Without **use_uid**, the check uses the login session's user, which may not be the user running su. Combining **sufficient** with **trust** removes the password prompt for su, so only use it on tightly controlled groups. Many distributions ship the line commented out, so wheel membership has no effect on su until it is enabled.

# HISTORY

**pam_wheel** is part of **Linux-PAM** and implements the BSD convention of limiting su to members of the wheel group.

# SEE ALSO

[pam](/man/pam)(8), [su](/man/su)(1), [sudo](/man/sudo)(8), [pam_rootok](/man/pam_rootok)(8)

# RESOURCES

```[Source code](https://github.com/linux-pam/linux-pam)```

<!-- verified: 2026-11-08 -->
