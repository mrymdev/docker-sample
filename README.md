# Docker Sample

In this sample we have created sample rest controller to run with docker.

## Running project

In order to run app create project image with following command:

docker build -t docker-sample:1.0.0 .

You can run it with following command:

docker run -p 8089:8080 docker-sample

You also can specify an environment variable while running container to change application port:

docker run -p 8099:8099 --env ENV_CUSTOM_PORT=8099 docker-sample

The following line of logs means the app is started on desired port:

2023-01-19 10:48:04,382 [main] INFO  c.s.d.c.EnvironmentConfigurer                      - Starting app on port: 8099
