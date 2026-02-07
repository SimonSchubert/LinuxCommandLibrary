# TAGLINE

command-line client for etcd key-value store

# TLDR

**Set a key**

```etcdctl put [mykey] "[myvalue]"```

**Get a key**

```etcdctl get [mykey]```

**Get all keys with prefix**

```etcdctl get --prefix [/myapp/]```

**Delete a key**

```etcdctl del [mykey]```

**Watch for changes**

```etcdctl watch [mykey]```

**List cluster members**

```etcdctl member list```

**Check cluster health**

```etcdctl endpoint health```

# SYNOPSIS

**etcdctl** [_global-options_] _command_ [_args_]

# PARAMETERS

**put** _key_ _value_
> Set key to value.

**get** _key_
> Get key value.

**del** _key_
> Delete key.

**watch** _key_
> Watch key for changes.

**--prefix**
> Apply operation to keys with prefix.

**member list**
> List cluster members.

**member add** _name_ _urls_
> Add cluster member.

**member remove** _id_
> Remove cluster member.

**endpoint health**
> Check endpoint health.

**snapshot save** _file_
> Save cluster snapshot.

**snapshot restore** _file_
> Restore from snapshot.

**--endpoints** _urls_
> etcd endpoints.

**--cacert** _file_
> CA certificate.

**--cert** _file_
> Client certificate.

**--key** _file_
> Client key.

# DESCRIPTION

**etcdctl** is the command-line client for etcd, a distributed key-value store used for shared configuration and service discovery. It's a core component of Kubernetes for storing cluster state.

etcd provides strong consistency through the Raft consensus algorithm. etcdctl manages keys, watches for changes, and administers the cluster.

# CAVEATS

API version 3 is default (set ETCDCTL_API=3). Authentication may be required. Cluster operations need careful planning. Snapshots should be taken regularly. Large values impact performance.

# HISTORY

etcd was created by **CoreOS** in **2013** as a distributed configuration store for their Container Linux. It became a CNCF project and is now maintained by the etcd community. Kubernetes adopted etcd as its backing store from the beginning.

# SEE ALSO

[kubectl](/man/kubectl)(1), [consul](/man/consul)(1), [zookeeper](/man/zookeeper)(1)
