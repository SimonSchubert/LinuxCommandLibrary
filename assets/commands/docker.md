# TLDR

**Run** container

```docker run [image]```

**List** containers

```docker ps```

**Build** image

```docker build -t [name] [.]```

**Pull** image

```docker pull [image]```

**Stop** container

```docker stop [container]```

**Remove** container

```docker rm [container]```

**Execute** command in container

```docker exec -it [container] [bash]```

# SYNOPSIS

**docker** _command_ [_options_]

# DESCRIPTION

**docker** is a platform for developing, shipping, and running applications in containers. It packages applications with dependencies into standardized units, ensuring consistency across different environments.

The tool has revolutionized application deployment and development workflows.

# PARAMETERS

**run** [_options_] _image_
> Create and start container

**ps** [**-a**]
> List containers

**build** **-t** _name_ _path_
> Build image from Dockerfile

**pull** _image_
> Pull image from registry

**push** _image_
> Push image to registry

**exec** _container_ _command_
> Execute command in running container

**logs** _container_
> Fetch container logs

**stop** _container_
> Stop running container

**start** _container_
> Start stopped container

**rm** _container_
> Remove container

**rmi** _image_
> Remove image

**images**
> List images

# RUN OPTIONS

**-d**, **--detach**
> Run in background

**-it**
> Interactive with TTY

**-p** _host_**:**_container_
> Publish port

**-v** _host_**:**_container_
> Mount volume

**--name** _name_
> Assign name to container

**-e** _var_**=**_value_
> Set environment variable

**--rm**
> Automatically remove on exit

**--network** _network_
> Connect to network

# WORKFLOW

```bash
# Run container
docker run -d -p 80:80 --name webserver nginx

# Interactive container
docker run -it ubuntu bash

# With environment variables
docker run -e DATABASE_URL=postgres://... myapp

# With volume mount
docker run -v $(pwd):/app -w /app node npm install

# Build image
docker build -t myapp:latest .

# Push to registry
docker tag myapp:latest user/myapp:latest
docker push user/myapp:latest

# View logs
docker logs -f container_name

# Execute command
docker exec -it container_name bash

# Clean up
docker stop container_name
docker rm container_name
docker rmi image_name
```

# DOCKERFILE

```dockerfile
FROM node:18
WORKDIR /app
COPY package*.json ./
RUN npm install
COPY . .
EXPOSE 3000
CMD ["node", "server.js"]
```

# COMMON OPERATIONS

```bash
# List running containers
docker ps

# List all containers
docker ps -a

# List images
docker images

# Remove all stopped containers
docker container prune

# Remove unused images
docker image prune

# System-wide cleanup
docker system prune -a

# Inspect container
docker inspect container_name

# Container stats
docker stats
```

# CAVEATS

Requires Docker daemon running. Root or docker group membership needed. Networking can be complex. Volume permissions issues common. Images can be large. Security considerations for production. Different behavior on different operating systems.

# HISTORY

**Docker** was created by Solomon Hykes at dotCloud in **2013**, becoming open-source and revolutionizing application containerization.

# SEE ALSO

[docker-compose](/man/docker-compose)(1), [podman](/man/podman)(1), [kubectl](/man/kubectl)(1)
