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
> Repository URL to pull from

**-C** _checkout_, **--checkout** _checkout_
> Branch, tag, or commit to checkout

**-d** _dir_, **--directory** _dir_
> Local destination directory for the checkout

**-i** _inventory_, **--inventory** _inventory_
> Inventory file/path or comma-separated host list (often "localhost,")

**-m** _name_, **--module-name** _name_
> SCM module used to check out the repo: git, subversion, hg, or bzr (default: git)

**-o**, **--only-if-changed**
> Only run the playbook if the repository has changed

**-s** _seconds_, **--sleep** _seconds_
> Sleep a random interval (0 to seconds) before starting, to stagger runs

**--purge**
> Purge the checkout after the playbook run completes

**-f**, **--force**
> Run the playbook even if the repository update fails

**--full**
> Do a full clone instead of a shallow one

**--verify-commit**
> Verify the GPG signature of the checked-out commit (git only)

**--accept-host-key**
> Add the repository host key if not already present

# CONFIGURATION

**/etc/ansible/ansible.cfg**
> System-wide Ansible configuration on the target node.

**~/.ansible.cfg**
> Per-user Ansible configuration overriding system defaults.

**ansible.cfg**
> Project-level configuration in the current directory, highest priority.

# CAVEATS

Requires git (or the chosen SCM) and ansible on the target node. Credentials for private repos need configuration. Failure leaves the node in a potentially inconsistent state. If no playbook is given, ansible-pull looks for one named after the host's fully qualified domain name, then its hostname, and finally local.yml.

# HISTORY

**ansible-pull** was introduced to support pull-based configuration management, addressing scalability concerns with the traditional push model.

# SEE ALSO

[ansible-playbook](/man/ansible-playbook)(1), [ansible](/man/ansible)(1), [git](/man/git)(1)

# RESOURCES

```[Source code](https://github.com/ansible/ansible)```

```[Documentation](https://docs.ansible.com/ansible/latest/cli/ansible-pull.html)```

<!-- verified: 2026-06-11 -->
