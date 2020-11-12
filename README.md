# mongodb-broker is no longer actively maintained by VMware.


## Getting Started

You need to install and run MongoDB somewhere.

This sample project uses the Spring Cloud - Cloud Foundry Service Broker to implement a MongoDB service broker.

Steps to run MongoDB Broker:

Checkout the MongoDB service broker from github
Option 1: Upload the .pivotal artifact in mongodb-broker/tile/product/releases to your Ops Manager (tested on and works on Version 1.6.9+) and set up your MongoDB configuration
Option 2: Navigate to mongodb-broker/tile
$ > mvn clean
$ > mvn package
$ > tile init
$ > tile build
Upload the newly created .pivotal artifact from mongodb-broker/tile/product/releases to your Ops Manager (tested on and works on Version 1.6.9+) and set up your MongoDB configuration as usual


