# TAGLINE

Pull and run playbooks from a repository

# TLDR

**Pull** and run playbook from git

```ansible-pull -U [https://github.com/user/repo.git]```

Run specific **playbook**

```ansible-pull -U [repo_url] [playbook.yml]```

Pull from **specific branch**

```ansible-pull -U [repo_url] -C [branch_name]```

Run with **inventory**

```ansible-pull -U [repo_url] -i [localhost,]```

Run **periodically** via cron

```ansible-pull -U [repo_url] -o --sleep [60]```

# SYNOPSIS

**ansible-pull** -U _repo_url_ [_-C branch_] [_-d dest_] [_playbook.yml_]

# DESCRIPTION

**ansible-pull** inverts the normal Ansible push model by having nodes pull configuration from a central repository. Nodes periodically fetch a git repository containing playbooks and run them locally.

This is useful for scaling to many nodes, bootstrap scenarios, or environments where nodes initiate their own configuration.

# PARAMETERS

**-U** _url_, **--url** _url_
> Git repository URL

**-C** _branch_, **--checkout** _branch_
> Branch, tag, or commit to checkout

**-d** _dir_, **--directory** _dir_
> Local directory for repository

**-i** _inventory_
> Inventory (often "localhost,")

**-o**, **--only-if-changed**
> Only run playbook if repo changed

**--sleep** _seconds_
> Random sleep before running (for staggering)

**--purge**
> Delete local repo before cloning

**-f**, **--force**
> Force run even if checkout fails

**--full**
> Full clone instead of shallow

**--accept-host-key**
> Accept SSH host key

# CONFIGURATION

**/etc/ansible/ansible.cfg**
> System-wide Ansible configuration on the target node.

**~/.ansible.cfg**
> Per-user Ansible configuration overriding system defaults.

**ansible.cfg**
> Project-level configuration in the current directory, highest priority.

# CAVEATS

Requires git and ansible on the target node. Credentials for private repos need configuration. Failure leaves node in potentially inconsistent state.

# HISTORY

**ansible-pull** was introduced to support pull-based configuration management, addressing scalability concerns with the traditional push model.

# SEE ALSO

[ansible-playbook](/man/ansible-playbook)(1), [ansible](/man/ansible)(1), [git](/man/git)(1)
