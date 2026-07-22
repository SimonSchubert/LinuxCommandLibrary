# TAGLINE

disk quota editor

# TLDR

Edit quota of **current user**

```edquota -u $(whoami)```

Edit quota of **specific user**

```sudo edquota -u [username]```

Edit quota for **group**

```sudo edquota -g [group]```

Restrict to **specific filesystem**

```sudo edquota -f [filesystem]```

Edit default **grace period**

```sudo edquota -t```

**Duplicate** quota to other users

```sudo edquota -p [reference_user] [destination_user1] [destination_user2]```

# SYNOPSIS

**edquota** [_options_] _name_...

# DESCRIPTION

**edquota** edits disk quotas for users, groups or projects. It writes the current limits and usage into a temporary file, opens it in an editor, and applies whatever you save back to the quota system.

Each line covers one filesystem and holds four editable numbers: soft and hard limits on blocks, and soft and hard limits on inodes. The usage columns are informational and any change to them is ignored. A limit of 0 means no limit.

# PARAMETERS

**-u, --user**
> Edit user quota (default)

**-g, --group**
> Edit group quota

**-P, --project**
> Edit project quota

**-f, --filesystem** _fs_
> Restrict the operation to a single filesystem

**-F, --format** _format_
> Quota format to use: vfsold, vfsv0, vfsv1 or rpc

**-t, --edit-period**
> Edit the grace periods rather than the limits

**-T, --edit-times**
> Edit the time the soft limit was exceeded for individual users or groups

**-p, --prototype** _user_
> Copy the quota settings of a prototype user or group to the named users

**-r, --remote**
> Edit quotas on a remote server over RPC

# CONFIGURATION

**aquota.user** / **aquota.group** (at filesystem root)
> Quota files for the modern vfsv0/vfsv1 formats. Older vfsold filesystems use quota.user and quota.group. XFS and ext4 with the quota feature keep quota information in hidden metadata inodes instead, and no visible file exists.

**/etc/fstab**
> The filesystem must be mounted with usrquota, grpquota and/or prjquota for quotas to be enforced.

# CAVEATS

Quotas must be enabled on the filesystem (see quotacheck and quotaon) before edquota does anything useful. Root privileges are needed to edit anyone else's quota. The editor is chosen from $EDITOR, then $VISUAL, falling back to vi. Saving a file that no longer parses leaves the quotas unchanged.

# INSTALL

```apt: sudo apt install quota```

```dnf: sudo dnf install quota```

```pacman: sudo pacman -S quota-tools```

```apk: sudo apk add quota-tools```

```zypper: sudo zypper install quota```

```nix: nix profile install nixpkgs#quota```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[quota](/man/quota)(1), [repquota](/man/repquota)(8), [quotaon](/man/quotaon)(8), [quotacheck](/man/quotacheck)(8), [setquota](/man/setquota)(8)

# RESOURCES

```[Source code](https://sourceforge.net/p/linuxquota/code/ci/master/tree/)```

```[Homepage](https://sourceforge.net/projects/linuxquota/)```

<!-- verified: 2026-07-14 -->
