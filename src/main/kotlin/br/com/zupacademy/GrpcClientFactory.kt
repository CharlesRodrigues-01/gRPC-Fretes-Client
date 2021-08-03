package br.com.zupacademy

import io.grpc.ManagedChannel
import io.micronaut.context.annotation.Factory
import io.micronaut.grpc.annotation.GrpcChannel
import javax.inject.Singleton

@Factory
class GrpcClientFactory {

    @Singleton
    fun fretesClinetStub(@GrpcChannel("fretes")channel: ManagedChannel) : FretesServiceGrpc.FretesServiceBlockingStub? {
       return FretesServiceGrpc.newBlockingStub(channel)
    }
}