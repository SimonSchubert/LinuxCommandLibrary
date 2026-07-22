# TAGLINE

Check and prepare RabbitMQ upgrades

# TLDR

**Check upgrade readiness**

```rabbitmq-upgrade await_online_quorum_plus_one```

**Drain node for upgrade**

```rabbitmq-upgrade drain```

**Revive node after upgrade**

```rabbitmq-upgrade revive```

# SYNOPSIS

**rabbitmq-upgrade** _command_ [_options_]

# PARAMETERS

**await_online_quorum_plus_one**
> Wait for sufficient online replicas.

**drain**
> Prepare node for shutdown/upgrade.

**revive**
> Restore node after upgrade.

**post_upgrade**
> Run post-upgrade tasks.

**-n** _node_
> Target node.

# DESCRIPTION

**rabbitmq-upgrade** assists with RabbitMQ cluster upgrades. Ensures safe rolling upgrades by managing node state and checking quorum health. Part of RabbitMQ CLI tools.

# INSTALL

```dnf: sudo dnf install rabbitmq-server```

```apk: sudo apk add rabbitmq-server```

```zypper: sudo zypper install rabbitmq-server```

```nix: nix profile install nixpkgs#rabbitmq-server```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[rabbitmqctl](/man/rabbitmqctl)(1), [rabbitmq-queues](/man/rabbitmq-queues)(1)

