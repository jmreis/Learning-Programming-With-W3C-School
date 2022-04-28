# Building docker images from differents python versions
# Choose the python version on https://hub.docker.com/_/python
FROM python:3.10.4-bullseye
WORKDIR /usr/src/app
#RUN python -m pip install \
#        parse \
#        realpython-reader
COPY . .
CMD ["python", "*.py"]
