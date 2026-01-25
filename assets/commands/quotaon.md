# TLDR

**Enable quotas on filesystem**

```sudo quotaon [/home]```

**Enable all quotas**

```sudo quotaon -a```

**Enable user quotas only**

```sudo quotaon -u [/home]```

**Enable group quotas only**

```sudo quotaon -g [/home]```

**Verbose output**

```sudo quotaon -v [/home]```

# SYNOPSIS

**quotaon** [_options_] [_filesystem_...]

# PARAMETERS

**-a**
> Enable all filesystems in /etc/fstab.

**-u**
> Enable user quotas.

**-g**
> Enable group quotas.

**-v**
> Verbose mode.

**-p**
> Print status only.

**-f**
> Force enable.

# DESCRIPTION

**quotaon** enables disk quota enforcement on filesystems. Quotas must first be configured in /etc/fstab and quota files created with quotacheck.

# EXAMPLES

```bash
# Enable all configured quotas
sudo quotaon -a

# Enable on specific filesystem
sudo quotaon /home

# Enable user quotas only
sudo quotaon -u /home

# Check what would be enabled
sudo quotaon -p /home

# Enable with verbose output
sudo quotaon -vug /home
```

# SETUP WORKFLOW

```bash
# 1. Edit /etc/fstab (add usrquota,grpquota)
# 2. Remount filesystem
mount -o remount /home

# 3. Create quota files
quotacheck -cug /home

# 4. Enable quotas
quotaon /home

# 5. Set user limits
edquota -u username
```

# CAVEATS

Requires quota support in kernel and filesystem. Must run quotacheck first. Requires root privileges.

# HISTORY

Disk quotas originated in **BSD Unix** and were adopted by Linux for managing disk space allocation.

# SEE ALSO

[quotaoff](/man/quotaoff)(8), [quotacheck](/man/quotacheck)(8), [edquota](/man/edquota)(8), [repquota](/man/repquota)(8)
