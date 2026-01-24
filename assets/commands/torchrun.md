# TLDR

**Run distributed training** on a single node with 4 GPUs

```torchrun --standalone --nproc_per_node=4 [train.py]```

**Run multi-node training** with 2 nodes and 4 GPUs each

```torchrun --nnodes=2 --nproc_per_node=4 --rdzv_endpoint=[master_ip:29500] [train.py]```

**Run with specific rendezvous backend**

```torchrun --nnodes=2 --nproc_per_node=4 --rdzv_backend=c10d --rdzv_endpoint=[master_ip:29500] [train.py]```

**Run with fault tolerance** allowing restarts

```torchrun --nnodes=2 --nproc_per_node=4 --max_restarts=3 --rdzv_endpoint=[master_ip:29500] [train.py]```

**Run single GPU training** (equivalent to regular python)

```torchrun --standalone --nproc_per_node=1 [train.py]```

# SYNOPSIS

**torchrun** [**--nnodes** _N_] [**--nproc_per_node** _N_] [**--rdzv_backend** _backend_] [**--rdzv_endpoint** _host:port_] [**--standalone**] _script.py_ [_script_args_]

# PARAMETERS

**--nnodes** _min_:max_ or _N_
> Number of nodes participating in training. Can be a range for elastic training.

**--nproc_per_node** _N_
> Number of processes to spawn per node. Typically equals the number of GPUs.

**--standalone**
> Single-node mode without external rendezvous. Sets up local rendezvous automatically.

**--rdzv_backend** _backend_
> Rendezvous backend: c10d (default), etcd, etcd-v2, or static.

**--rdzv_endpoint** _host:port_
> Rendezvous endpoint address. For c10d, the master node's IP and port.

**--rdzv_id** _id_
> User-defined ID for the rendezvous group. All nodes must use the same ID.

**--max_restarts** _N_
> Maximum number of worker group restarts on failure. Default is 0.

**--node_rank** _N_
> Rank of this node (for static rendezvous).

**--master_addr** _addr_
> Master node address (legacy, use --rdzv_endpoint instead).

**--master_port** _port_
> Master node port (legacy, use --rdzv_endpoint instead).

**--local-rank**
> Passed to the training script indicating the local process rank.

# DESCRIPTION

**torchrun** is PyTorch's distributed training launcher that replaces the deprecated torch.distributed.launch. It spawns multiple processes across GPUs and nodes, setting up the distributed environment for training neural networks at scale.

The launcher supports various distributed strategies including Data Distributed Parallel (DDP), Fully Sharded Data Parallel (FSDP), tensor parallelism, and hybrid approaches. It automatically sets environment variables like RANK, WORLD_SIZE, LOCAL_RANK, MASTER_ADDR, and MASTER_PORT for distributed communication.

For single-node multi-GPU training, use **--standalone** mode. For multi-node training, all nodes must specify the same rendezvous endpoint where they coordinate. The launcher supports elastic training with dynamic node counts and fault tolerance with automatic restarts when workers fail.

# CAVEATS

Training scripts must be written to handle distributed setup using torch.distributed. The number of processes per node should not exceed available GPUs for GPU training. All nodes in a distributed job must use compatible PyTorch versions and NCCL configurations. Network firewalls must allow communication on the rendezvous port.

# HISTORY

**torchrun** was introduced in **PyTorch 1.10** (October 2021) as part of the TorchElastic project, replacing the older torch.distributed.launch module. It was designed to provide elastic and fault-tolerant distributed training capabilities. From **PyTorch 2.0** (March 2023), the command-line argument style changed from underscores to dashes (--local-rank instead of --local_rank).

# SEE ALSO

[python](/man/python)(1), [nvidia-smi](/man/nvidia-smi)(1)
